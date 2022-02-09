// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetHcxEnterpriseSiteResult {
    private final String activationKey;
    private final String id;
    private final String name;
    private final String status;
    private final String type;

    @OutputCustomType.Constructor({"activationKey","id","name","status","type"})
    private GetHcxEnterpriseSiteResult(
        String activationKey,
        String id,
        String name,
        String status,
        String type) {
        this.activationKey = Objects.requireNonNull(activationKey);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
    }

    public String getActivationKey() {
        return this.activationKey;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getStatus() {
        return this.status;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHcxEnterpriseSiteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activationKey;
        private String id;
        private String name;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHcxEnterpriseSiteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setActivationKey(String activationKey) {
            this.activationKey = Objects.requireNonNull(activationKey);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetHcxEnterpriseSiteResult build() {
            return new GetHcxEnterpriseSiteResult(activationKey, id, name, status, type);
        }
    }
}
