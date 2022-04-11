// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.ToolExecutionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Generic tool step to be used for binaries we do not explicitly support. For example: running cp to copy artifacts from one location to another.
 * 
 */
public final class ToolExecutionStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final ToolExecutionStepArgs Empty = new ToolExecutionStepArgs();

    /**
     * A Tool execution. - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @Import(name="toolExecution")
      private final @Nullable Output<ToolExecutionArgs> toolExecution;

    public Output<ToolExecutionArgs> getToolExecution() {
        return this.toolExecution == null ? Codegen.empty() : this.toolExecution;
    }

    public ToolExecutionStepArgs(@Nullable Output<ToolExecutionArgs> toolExecution) {
        this.toolExecution = toolExecution;
    }

    private ToolExecutionStepArgs() {
        this.toolExecution = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolExecutionStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ToolExecutionArgs> toolExecution;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolExecutionStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.toolExecution = defaults.toolExecution;
        }

        public Builder toolExecution(@Nullable Output<ToolExecutionArgs> toolExecution) {
            this.toolExecution = toolExecution;
            return this;
        }
        public Builder toolExecution(@Nullable ToolExecutionArgs toolExecution) {
            this.toolExecution = Codegen.ofNullable(toolExecution);
            return this;
        }        public ToolExecutionStepArgs build() {
            return new ToolExecutionStepArgs(toolExecution);
        }
    }
}
