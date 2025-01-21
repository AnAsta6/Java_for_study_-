package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.Repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
public class MainController {

    private final ClientRepository clientRepository;
    private final ServiceRepository serviceRepository;
    private final SubscriberRepository subscriberRepository;
    private final TariffRepository tariffRepository;
    private final TrafficRepository trafficRepository;

    @GetMapping("/")
    public String index(Model model) {
        List<Client> clients = clientRepository.findAll()
                .stream()
                .sorted(Comparator.comparingInt(Client::getId))
                .collect(Collectors.toList());

        List<Subscriber> subscribers = subscriberRepository.findAll()
                .stream()
                .sorted(Comparator.comparingInt(Subscriber::getId))
                .collect(Collectors.toList());

        List<Tariff> tariffs = tariffRepository.findAll()
                .stream()
                .sorted(Comparator.comparingInt(Tariff::getId))
                .collect(Collectors.toList());

        List<Service> services = serviceRepository.findAll()
                .stream()
                .sorted(Comparator.comparingInt(Service::getId))
                .collect(Collectors.toList());

        List<Traffic> traffics = trafficRepository.findAll()
                .stream()
                .sorted(Comparator.comparingInt(Traffic::getId))
                .collect(Collectors.toList());

        model.addAttribute("clients", clients);
        model.addAttribute("subscribers", subscribers);
        model.addAttribute("tariffs", tariffs);
        model.addAttribute("services", services);
        model.addAttribute("traffics", traffics);

        return "index";
    }

    @GetMapping("/addClient")
    public String showAddClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "addClient";
    }

    @PostMapping("/addClient")
    public String addClient(@ModelAttribute Client client) {
        clientRepository.save(client);
        return "redirect:/";
    }

    @GetMapping("/addSubscriber")
    public String showAddSubscriberForm(Model model) {
        model.addAttribute("subscriber", new Subscriber());
        return "addSubscriber";
    }

    @PostMapping("/addSubscriber")
    public String addSubscriber(@ModelAttribute Subscriber subscriber) {
        subscriberRepository.save(subscriber);
        return "redirect:/";
    }

    @GetMapping("/addTariff")
    public String showAddTariffForm(Model model) {
        model.addAttribute("tariff", new Tariff());
        return "addTariff";
    }

    @PostMapping("/addTariff")
    public String addTariff(@ModelAttribute Tariff tariff) {
        tariffRepository.save(tariff);
        return "redirect:/";
    }

    @GetMapping("/addService")
    public String showAddServiceForm(Model model) {
        model.addAttribute("service", new Service());
        model.addAttribute("subscribers", subscriberRepository.findAll());
        model.addAttribute("tariffs", tariffRepository.findAll());
        return "addService";
    }

    @PostMapping("/addService")
    public String addService(@ModelAttribute Service service) {
        serviceRepository.save(service);
        return "redirect:/";
    }

    @GetMapping("/addTraffic")
    public String showAddTrafficForm(Model model) {
        model.addAttribute("traffic", new Traffic());
        model.addAttribute("services", serviceRepository.findAll());
        return "addTraffic";
    }

    @PostMapping("/addTraffic")
    public String addTraffic(@ModelAttribute Traffic traffic) {
        trafficRepository.save(traffic);
        return "redirect:/";
    }

    @GetMapping("/deleteClient/{id}")
    public String deleteClient(@PathVariable Integer id) {
        clientRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/deleteSubscriber/{id}")
    public String deleteSubscriber(@PathVariable Integer id) {
        subscriberRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/deleteTariff/{id}")
    public String deleteTariff(@PathVariable Integer id) {
        tariffRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/deleteService/{id}")
    public String deleteService(@PathVariable Integer id) {
        serviceRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/deleteTraffic/{id}")
    public String deleteTraffic(@PathVariable Integer id) {
        trafficRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/editClient/{id}")
    public String showEditClientForm(@PathVariable Integer id, Model model) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
        model.addAttribute("client", client);
        return "editClient";
    }

    @PostMapping("/editClient/{id}")
    public String updateClient(@PathVariable Integer id, @ModelAttribute Client client) {
        client.setId(id);
        clientRepository.save(client);
        return "redirect:/";
    }

    @GetMapping("/editSubscriber/{id}")
    public String showEditSubscriberForm(@PathVariable Integer id, Model model) {
        Subscriber subscriber = subscriberRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid subscriber Id:" + id));
        model.addAttribute("subscriber", subscriber);
        return "editSubscriber";
    }

    @PostMapping("/editSubscriber/{id}")
    public String updateSubscriber(@PathVariable Integer id, @ModelAttribute Subscriber subscriber) {
        subscriber.setId(id);
        subscriberRepository.save(subscriber);
        return "redirect:/";
    }

    @GetMapping("/editTariff/{id}")
    public String showEditTariffForm(@PathVariable Integer id, Model model) {
        Tariff tariff = tariffRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid tariff Id:" + id));
        model.addAttribute("tariff", tariff);
        return "editTariff";
    }

    @PostMapping("/editTariff/{id}")
    public String updateTariff(@PathVariable Integer id, @ModelAttribute Tariff tariff) {
        tariff.setId(id);
        tariffRepository.save(tariff);
        return "redirect:/";
    }

    @GetMapping("/editService/{id}")
    public String showEditServiceForm(@PathVariable Integer id, Model model) {
        Service service = serviceRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid service Id:" + id));
        model.addAttribute("service", service);
        model.addAttribute("subscribers", subscriberRepository.findAll());
        model.addAttribute("tariffs", tariffRepository.findAll());
        return "editService";
    }

    @PostMapping("/editService/{id}")
    public String updateService(@PathVariable Integer id, @ModelAttribute Service service) {
        service.setId(id);
        serviceRepository.save(service);
        return "redirect:/";
    }

    @GetMapping("/editTraffic/{id}")
    public String showEditTrafficForm(@PathVariable Integer id, Model model) {
        Traffic traffic = trafficRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid traffic Id:" + id));
        model.addAttribute("traffic", traffic);
        model.addAttribute("services", serviceRepository.findAll());
        return "editTraffic";
    }

    @PostMapping("/editTraffic/{id}")
    public String updateTraffic(@PathVariable Integer id, @ModelAttribute Traffic traffic) {
        traffic.setId(id);
        trafficRepository.save(traffic);
        return "redirect:/";
    }


}
