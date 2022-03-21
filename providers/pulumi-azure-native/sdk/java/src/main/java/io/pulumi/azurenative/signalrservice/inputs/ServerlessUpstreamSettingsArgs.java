// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.inputs;

import io.pulumi.azurenative.signalrservice.inputs.UpstreamTemplateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="templates")
      private final @Nullable Output<List<UpstreamTemplateArgs>> templates;

    public Output<List<UpstreamTemplateArgs>> getTemplates() {
        return this.templates == null ? Output.empty() : this.templates;
    }

    public ServerlessUpstreamSettingsArgs(@Nullable Output<List<UpstreamTemplateArgs>> templates) {
        this.templates = templates;
    }

    private ServerlessUpstreamSettingsArgs() {
        this.templates = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerlessUpstreamSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<UpstreamTemplateArgs>> templates;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerlessUpstreamSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.templates = defaults.templates;
        }

        public Builder templates(@Nullable Output<List<UpstreamTemplateArgs>> templates) {
            this.templates = templates;
            return this;
        }
        public Builder templates(@Nullable List<UpstreamTemplateArgs> templates) {
            this.templates = Output.ofNullable(templates);
            return this;
        }
        public Builder templates(UpstreamTemplateArgs... templates) {
            return templates(List.of(templates));
        }        public ServerlessUpstreamSettingsArgs build() {
            return new ServerlessUpstreamSettingsArgs(templates);
        }
    }
}
