// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallAllowArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallAllowArgs Empty = new FirewallAllowArgs();

    @InputImport(name="ports")
    private final @Nullable Input<List<String>> ports;

    public Input<List<String>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    @InputImport(name="protocol", required=true)
    private final Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol;
    }

    public FirewallAllowArgs(
        @Nullable Input<List<String>> ports,
        Input<String> protocol) {
        this.ports = ports;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private FirewallAllowArgs() {
        this.ports = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallAllowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> ports;
        private Input<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallAllowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ports = defaults.ports;
    	      this.protocol = defaults.protocol;
        }

        public Builder setPorts(@Nullable Input<List<String>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<String> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public Builder setProtocol(Input<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }

        public FirewallAllowArgs build() {
            return new FirewallAllowArgs(ports, protocol);
        }
    }
}