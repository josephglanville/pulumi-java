// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetServerAdministratorResult {
    private final String administratorType;
    private final String id;
    private final String login;
    private final String name;
    private final String sid;
    private final String tenantId;
    private final String type;

    @OutputCustomType.Constructor({"administratorType","id","login","name","sid","tenantId","type"})
    private GetServerAdministratorResult(
        String administratorType,
        String id,
        String login,
        String name,
        String sid,
        String tenantId,
        String type) {
        this.administratorType = Objects.requireNonNull(administratorType);
        this.id = Objects.requireNonNull(id);
        this.login = Objects.requireNonNull(login);
        this.name = Objects.requireNonNull(name);
        this.sid = Objects.requireNonNull(sid);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    public String getAdministratorType() {
        return this.administratorType;
    }
    public String getId() {
        return this.id;
    }
    public String getLogin() {
        return this.login;
    }
    public String getName() {
        return this.name;
    }
    public String getSid() {
        return this.sid;
    }
    public String getTenantId() {
        return this.tenantId;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerAdministratorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String administratorType;
        private String id;
        private String login;
        private String name;
        private String sid;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerAdministratorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.id = defaults.id;
    	      this.login = defaults.login;
    	      this.name = defaults.name;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setAdministratorType(String administratorType) {
            this.administratorType = Objects.requireNonNull(administratorType);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLogin(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSid(String sid) {
            this.sid = Objects.requireNonNull(sid);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetServerAdministratorResult build() {
            return new GetServerAdministratorResult(administratorType, id, login, name, sid, tenantId, type);
        }
    }
}
