// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerConfigScalingConfigSelectorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerConfigScalingConfigSelectorGetArgs Empty = new GameServerConfigScalingConfigSelectorGetArgs();

    /**
     * Set of labels to group by.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    public GameServerConfigScalingConfigSelectorGetArgs(@Nullable Output<Map<String,String>> labels) {
        this.labels = labels;
    }

    private GameServerConfigScalingConfigSelectorGetArgs() {
        this.labels = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigScalingConfigSelectorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerConfigScalingConfigSelectorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }        public GameServerConfigScalingConfigSelectorGetArgs build() {
            return new GameServerConfigScalingConfigSelectorGetArgs(labels);
        }
    }
}
