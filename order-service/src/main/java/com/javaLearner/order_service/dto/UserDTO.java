package com.javaLearner.order_service.dto;

/**
 * Data transfer object representing user information required by order-service.
 */
public class UserDTO {

    private Long id;
    private String name;
    private String email;

    /**
     * Creates a user payload.
     *
     * @param id user identifier
     * @param name display name
     * @param email email address
     */
    public UserDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /**
     * @return user identifier
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id user identifier
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return display name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name display name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email email address
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
