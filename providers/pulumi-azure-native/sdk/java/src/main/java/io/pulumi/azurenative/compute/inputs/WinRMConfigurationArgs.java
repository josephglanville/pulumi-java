// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.WinRMListenerArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes Windows Remote Management configuration of the VM
 * 
 */
public final class WinRMConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WinRMConfigurationArgs Empty = new WinRMConfigurationArgs();

    /**
     * The list of Windows Remote Management listeners
     * 
     */
    @InputImport(name="listeners")
      private final @Nullable Output<List<WinRMListenerArgs>> listeners;

    public Output<List<WinRMListenerArgs>> getListeners() {
        return this.listeners == null ? Output.empty() : this.listeners;
    }

    public WinRMConfigurationArgs(@Nullable Output<List<WinRMListenerArgs>> listeners) {
        this.listeners = listeners;
    }

    private WinRMConfigurationArgs() {
        this.listeners = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WinRMConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<WinRMListenerArgs>> listeners;

        public Builder() {
    	      // Empty
        }

        public Builder(WinRMConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listeners = defaults.listeners;
        }

        public Builder listeners(@Nullable Output<List<WinRMListenerArgs>> listeners) {
            this.listeners = listeners;
            return this;
        }

        public Builder listeners(@Nullable List<WinRMListenerArgs> listeners) {
            this.listeners = Output.ofNullable(listeners);
            return this;
        }
        public WinRMConfigurationArgs build() {
            return new WinRMConfigurationArgs(listeners);
        }
    }
}
