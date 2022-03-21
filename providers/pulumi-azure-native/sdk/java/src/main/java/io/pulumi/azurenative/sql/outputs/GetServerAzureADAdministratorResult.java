// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServerAzureADAdministratorResult {
    /**
     * Type of the sever administrator.
     * 
     */
    private final String administratorType;
    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    private final Boolean azureADOnlyAuthentication;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Login name of the server administrator.
     * 
     */
    private final String login;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * SID (object ID) of the server administrator.
     * 
     */
    private final String sid;
    /**
     * Tenant ID of the administrator.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServerAzureADAdministratorResult(
        @CustomType.Parameter("administratorType") String administratorType,
        @CustomType.Parameter("azureADOnlyAuthentication") Boolean azureADOnlyAuthentication,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("login") String login,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sid") String sid,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("type") String type) {
        this.administratorType = administratorType;
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        this.id = id;
        this.login = login;
        this.name = name;
        this.sid = sid;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * Type of the sever administrator.
     * 
    */
    public String getAdministratorType() {
        return this.administratorType;
    }
    /**
     * Azure Active Directory only Authentication enabled.
     * 
    */
    public Boolean getAzureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Login name of the server administrator.
     * 
    */
    public String getLogin() {
        return this.login;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * SID (object ID) of the server administrator.
     * 
    */
    public String getSid() {
        return this.sid;
    }
    /**
     * Tenant ID of the administrator.
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerAzureADAdministratorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String administratorType;
        private Boolean azureADOnlyAuthentication;
        private String id;
        private String login;
        private String name;
        private String sid;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerAzureADAdministratorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.azureADOnlyAuthentication = defaults.azureADOnlyAuthentication;
    	      this.id = defaults.id;
    	      this.login = defaults.login;
    	      this.name = defaults.name;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder administratorType(String administratorType) {
            this.administratorType = Objects.requireNonNull(administratorType);
            return this;
        }
        public Builder azureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = Objects.requireNonNull(azureADOnlyAuthentication);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder login(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sid(String sid) {
            this.sid = Objects.requireNonNull(sid);
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetServerAzureADAdministratorResult build() {
            return new GetServerAzureADAdministratorResult(administratorType, azureADOnlyAuthentication, id, login, name, sid, tenantId, type);
        }
    }
}
