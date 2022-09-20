package com.geekbrains.spring.web.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("secret.properties")
public class SpringWebApplication {
	// Домашнее задание:
	// 1. Добавить статус заказу: создан, оплачен, отменен. Оплачивать можно только созданные заказы
	// 2. Добавить в платеж корректный адрес
	// 3. На фронте отобразить детализацию заказа на странице оплаты
	// 4. * Разобраться с кодом взаимодействия с PayPal и подставить clientId/clientSecret

	// Ближайшие доработки:
	// x Categories
	// x Фронт кнопки назад вперед в пагинации
	// . Безопасность на уровне Gateway
	// . Посмотреть на Wiremock

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}
}
