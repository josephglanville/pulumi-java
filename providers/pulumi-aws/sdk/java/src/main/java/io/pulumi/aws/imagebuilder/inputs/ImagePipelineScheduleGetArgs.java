// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImagePipelineScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImagePipelineScheduleGetArgs Empty = new ImagePipelineScheduleGetArgs();

    /**
     * Condition when the pipeline should trigger a new image build. Valid values are `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` and `EXPRESSION_MATCH_ONLY`. Defaults to `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE`.
     * 
     */
    @Import(name="pipelineExecutionStartCondition")
      private final @Nullable Output<String> pipelineExecutionStartCondition;

    public Output<String> getPipelineExecutionStartCondition() {
        return this.pipelineExecutionStartCondition == null ? Output.empty() : this.pipelineExecutionStartCondition;
    }

    /**
     * Cron expression of how often the pipeline start condition is evaluated. For example, `cron(0 0 * * ? *)` is evaluated every day at midnight UTC. Configurations using the five field syntax that was previously accepted by the API, such as `cron(0 0 * * *)`, must be updated to the six field syntax. For more information, see the [Image Builder User Guide](https://docs.aws.amazon.com/imagebuilder/latest/userguide/cron-expressions.html).
     * 
     */
    @Import(name="scheduleExpression", required=true)
      private final Output<String> scheduleExpression;

    public Output<String> getScheduleExpression() {
        return this.scheduleExpression;
    }

    public ImagePipelineScheduleGetArgs(
        @Nullable Output<String> pipelineExecutionStartCondition,
        Output<String> scheduleExpression) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private ImagePipelineScheduleGetArgs() {
        this.pipelineExecutionStartCondition = Output.empty();
        this.scheduleExpression = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> pipelineExecutionStartCondition;
        private Output<String> scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineExecutionStartCondition = defaults.pipelineExecutionStartCondition;
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder pipelineExecutionStartCondition(@Nullable Output<String> pipelineExecutionStartCondition) {
            this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
            return this;
        }
        public Builder pipelineExecutionStartCondition(@Nullable String pipelineExecutionStartCondition) {
            this.pipelineExecutionStartCondition = Output.ofNullable(pipelineExecutionStartCondition);
            return this;
        }
        public Builder scheduleExpression(Output<String> scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }
        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Output.of(Objects.requireNonNull(scheduleExpression));
            return this;
        }        public ImagePipelineScheduleGetArgs build() {
            return new ImagePipelineScheduleGetArgs(pipelineExecutionStartCondition, scheduleExpression);
        }
    }
}
