// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator;

import io.pulumi.awsnative.globalaccelerator.enums.ListenerClientAffinity;
import io.pulumi.awsnative.globalaccelerator.enums.ListenerProtocol;
import io.pulumi.awsnative.globalaccelerator.inputs.ListenerPortRangeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerArgs Empty = new ListenerArgs();

    /**
     * The Amazon Resource Name (ARN) of the accelerator.
     * 
     */
    @InputImport(name="acceleratorArn", required=true)
      private final Input<String> acceleratorArn;

    public Input<String> getAcceleratorArn() {
        return this.acceleratorArn;
    }

    /**
     * Client affinity lets you direct all requests from a user to the same endpoint.
     * 
     */
    @InputImport(name="clientAffinity")
      private final @Nullable Input<ListenerClientAffinity> clientAffinity;

    public Input<ListenerClientAffinity> getClientAffinity() {
        return this.clientAffinity == null ? Input.empty() : this.clientAffinity;
    }

    @InputImport(name="portRanges", required=true)
      private final Input<List<ListenerPortRangeArgs>> portRanges;

    public Input<List<ListenerPortRangeArgs>> getPortRanges() {
        return this.portRanges;
    }

    /**
     * The protocol for the listener.
     * 
     */
    @InputImport(name="protocol", required=true)
      private final Input<ListenerProtocol> protocol;

    public Input<ListenerProtocol> getProtocol() {
        return this.protocol;
    }

    public ListenerArgs(
        Input<String> acceleratorArn,
        @Nullable Input<ListenerClientAffinity> clientAffinity,
        Input<List<ListenerPortRangeArgs>> portRanges,
        Input<ListenerProtocol> protocol) {
        this.acceleratorArn = Objects.requireNonNull(acceleratorArn, "expected parameter 'acceleratorArn' to be non-null");
        this.clientAffinity = clientAffinity;
        this.portRanges = Objects.requireNonNull(portRanges, "expected parameter 'portRanges' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private ListenerArgs() {
        this.acceleratorArn = Input.empty();
        this.clientAffinity = Input.empty();
        this.portRanges = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> acceleratorArn;
        private @Nullable Input<ListenerClientAffinity> clientAffinity;
        private Input<List<ListenerPortRangeArgs>> portRanges;
        private Input<ListenerProtocol> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorArn = defaults.acceleratorArn;
    	      this.clientAffinity = defaults.clientAffinity;
    	      this.portRanges = defaults.portRanges;
    	      this.protocol = defaults.protocol;
        }

        public Builder setAcceleratorArn(Input<String> acceleratorArn) {
            this.acceleratorArn = Objects.requireNonNull(acceleratorArn);
            return this;
        }

        public Builder setAcceleratorArn(String acceleratorArn) {
            this.acceleratorArn = Input.of(Objects.requireNonNull(acceleratorArn));
            return this;
        }

        public Builder setClientAffinity(@Nullable Input<ListenerClientAffinity> clientAffinity) {
            this.clientAffinity = clientAffinity;
            return this;
        }

        public Builder setClientAffinity(@Nullable ListenerClientAffinity clientAffinity) {
            this.clientAffinity = Input.ofNullable(clientAffinity);
            return this;
        }

        public Builder setPortRanges(Input<List<ListenerPortRangeArgs>> portRanges) {
            this.portRanges = Objects.requireNonNull(portRanges);
            return this;
        }

        public Builder setPortRanges(List<ListenerPortRangeArgs> portRanges) {
            this.portRanges = Input.of(Objects.requireNonNull(portRanges));
            return this;
        }

        public Builder setProtocol(Input<ListenerProtocol> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(ListenerProtocol protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }
        public ListenerArgs build() {
            return new ListenerArgs(acceleratorArn, clientAffinity, portRanges, protocol);
        }
    }
}
