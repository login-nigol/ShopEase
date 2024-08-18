package ShopEase.models;

import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@Entity
public class Products {
    @Id // использоваться для уникальной идентификации каждой записи
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ключ генерируеться базой данных автоматически
    private Long id;
    private String name;
    private double price;
}


// В аннотациях @Id и @GeneratedValue(strategy = GenerationType.IDENTITY) описывается настройка первичного ключа
// в сущности, которая используется в рамках работы с базой данных в JPA (Java Persistence API) или Hibernate.
//
//@Id: Эта аннотация обозначает поле в классе-сущности как первичный ключ. Поле, аннотированное @Id, будет
// использоваться для уникальной идентификации каждой записи в таблице базы данных. Каждый объект сущности в Java
// будет привязан к строке в таблице через это поле.
//
//@GeneratedValue(strategy = GenerationType.IDENTITY): Эта аннотация указывает, как будет генерироваться значение для
// первичного ключа. В данном случае используется стратегия GenerationType.IDENTITY.
//
//GenerationType.IDENTITY: Эта стратегия означает, что значение для первичного ключа будет генерироваться базой данных
// автоматически. Обычно это происходит путем автоинкремента значения в базе данных. Например, если у вас есть таблица
// с целочисленным первичным ключом, и вы вставляете новую строку, база данных автоматически присвоит ей значение
// первичного ключа, которое будет на единицу больше, чем значение ключа в предыдущей строке.