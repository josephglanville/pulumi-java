// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostingEnvironmentProfileResponse {
    /**
     * Resource ID of the App Service Environment.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the App Service Environment.
     * 
     */
    private final String name;
    /**
     * Resource type of the App Service Environment.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private HostingEnvironmentProfileResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * Resource ID of the App Service Environment.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the App Service Environment.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type of the App Service Environment.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostingEnvironmentProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HostingEnvironmentProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public HostingEnvironmentProfileResponse build() {
            return new HostingEnvironmentProfileResponse(id, name, type);
        }
    }
}
