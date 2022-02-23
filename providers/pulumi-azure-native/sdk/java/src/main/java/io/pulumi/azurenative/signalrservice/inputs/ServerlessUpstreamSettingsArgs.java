// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.inputs;

import io.pulumi.azurenative.signalrservice.inputs.UpstreamTemplateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings for the Upstream when the Azure SignalR is in server-less mode.
 * 
 */
public final class ServerlessUpstreamSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerlessUpstreamSettingsArgs Empty = new ServerlessUpstreamSettingsArgs();

    /**
     * Gets or sets the list of Upstream URL templates. Order matters, and the first matching template takes effects.
     * 
     */
    @InputImport(name="templates")
      private final @Nullable Input<List<UpstreamTemplateArgs>> templates;

    public Input<List<UpstreamTemplateArgs>> getTemplates() {
        return this.templates == null ? Input.empty() : this.templates;
    }

    public ServerlessUpstreamSettingsArgs(@Nullable Input<List<UpstreamTemplateArgs>> templates) {
        this.templates = templates;
    }

    private ServerlessUpstreamSettingsArgs() {
        this.templates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerlessUpstreamSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<UpstreamTemplateArgs>> templates;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerlessUpstreamSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.templates = defaults.templates;
        }

        public Builder setTemplates(@Nullable Input<List<UpstreamTemplateArgs>> templates) {
            this.templates = templates;
            return this;
        }

        public Builder setTemplates(@Nullable List<UpstreamTemplateArgs> templates) {
            this.templates = Input.ofNullable(templates);
            return this;
        }
        public ServerlessUpstreamSettingsArgs build() {
            return new ServerlessUpstreamSettingsArgs(templates);
        }
    }
}
