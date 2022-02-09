// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.azurenative.guestconfiguration.inputs.ConfigurationInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssignmentInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final AssignmentInfoResponse Empty = new AssignmentInfoResponse();

    @InputImport(name="configuration")
    private final @Nullable ConfigurationInfoResponse configuration;

    public Optional<ConfigurationInfoResponse> getConfiguration() {
        return this.configuration == null ? Optional.empty() : Optional.ofNullable(this.configuration);
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public AssignmentInfoResponse(
        @Nullable ConfigurationInfoResponse configuration,
        String name) {
        this.configuration = configuration;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private AssignmentInfoResponse() {
        this.configuration = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigurationInfoResponse configuration;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.name = defaults.name;
        }

        public Builder setConfiguration(@Nullable ConfigurationInfoResponse configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public AssignmentInfoResponse build() {
            return new AssignmentInfoResponse(configuration, name);
        }
    }
}
