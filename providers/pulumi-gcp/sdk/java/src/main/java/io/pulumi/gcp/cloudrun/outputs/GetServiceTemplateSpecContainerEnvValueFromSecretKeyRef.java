// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef {
    private final String key;
    /**
     * The name of the Cloud Run Service.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("name") String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return this.key;
    }
    /**
     * The name of the Cloud Run Service.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef build() {
            return new GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef(key, name);
        }
    }
}
