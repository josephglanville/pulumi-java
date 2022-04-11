// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.ServiceBusAuthenticationType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceBusAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceBusAuthenticationArgs Empty = new ServiceBusAuthenticationArgs();

    /**
     * Gets or sets the SAS key.
     * 
     */
    @Import(name="sasKey")
      private final @Nullable Output<String> sasKey;

    public Output<String> getSasKey() {
        return this.sasKey == null ? Codegen.empty() : this.sasKey;
    }

    /**
     * Gets or sets the SAS key name.
     * 
     */
    @Import(name="sasKeyName")
      private final @Nullable Output<String> sasKeyName;

    public Output<String> getSasKeyName() {
        return this.sasKeyName == null ? Codegen.empty() : this.sasKeyName;
    }

    /**
     * Gets or sets the authentication type.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<ServiceBusAuthenticationType> type;

    public Output<ServiceBusAuthenticationType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ServiceBusAuthenticationArgs(
        @Nullable Output<String> sasKey,
        @Nullable Output<String> sasKeyName,
        @Nullable Output<ServiceBusAuthenticationType> type) {
        this.sasKey = sasKey;
        this.sasKeyName = sasKeyName;
        this.type = type;
    }

    private ServiceBusAuthenticationArgs() {
        this.sasKey = Codegen.empty();
        this.sasKeyName = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> sasKey;
        private @Nullable Output<String> sasKeyName;
        private @Nullable Output<ServiceBusAuthenticationType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasKey = defaults.sasKey;
    	      this.sasKeyName = defaults.sasKeyName;
    	      this.type = defaults.type;
        }

        public Builder sasKey(@Nullable Output<String> sasKey) {
            this.sasKey = sasKey;
            return this;
        }
        public Builder sasKey(@Nullable String sasKey) {
            this.sasKey = Codegen.ofNullable(sasKey);
            return this;
        }
        public Builder sasKeyName(@Nullable Output<String> sasKeyName) {
            this.sasKeyName = sasKeyName;
            return this;
        }
        public Builder sasKeyName(@Nullable String sasKeyName) {
            this.sasKeyName = Codegen.ofNullable(sasKeyName);
            return this;
        }
        public Builder type(@Nullable Output<ServiceBusAuthenticationType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable ServiceBusAuthenticationType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ServiceBusAuthenticationArgs build() {
            return new ServiceBusAuthenticationArgs(sasKey, sasKeyName, type);
        }
    }
}
