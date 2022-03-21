// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final AttachmentState Empty = new AttachmentState();

    /**
     * The ARN of an ALB Target Group.
     * 
     */
    @Import(name="albTargetGroupArn")
      private final @Nullable Output<String> albTargetGroupArn;

    public Output<String> getAlbTargetGroupArn() {
        return this.albTargetGroupArn == null ? Output.empty() : this.albTargetGroupArn;
    }

    /**
     * Name of ASG to associate with the ELB.
     * 
     */
    @Import(name="autoscalingGroupName")
      private final @Nullable Output<String> autoscalingGroupName;

    public Output<String> getAutoscalingGroupName() {
        return this.autoscalingGroupName == null ? Output.empty() : this.autoscalingGroupName;
    }

    /**
     * The name of the ELB.
     * 
     */
    @Import(name="elb")
      private final @Nullable Output<String> elb;

    public Output<String> getElb() {
        return this.elb == null ? Output.empty() : this.elb;
    }

    public AttachmentState(
        @Nullable Output<String> albTargetGroupArn,
        @Nullable Output<String> autoscalingGroupName,
        @Nullable Output<String> elb) {
        this.albTargetGroupArn = albTargetGroupArn;
        this.autoscalingGroupName = autoscalingGroupName;
        this.elb = elb;
    }

    private AttachmentState() {
        this.albTargetGroupArn = Output.empty();
        this.autoscalingGroupName = Output.empty();
        this.elb = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> albTargetGroupArn;
        private @Nullable Output<String> autoscalingGroupName;
        private @Nullable Output<String> elb;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.albTargetGroupArn = defaults.albTargetGroupArn;
    	      this.autoscalingGroupName = defaults.autoscalingGroupName;
    	      this.elb = defaults.elb;
        }

        public Builder albTargetGroupArn(@Nullable Output<String> albTargetGroupArn) {
            this.albTargetGroupArn = albTargetGroupArn;
            return this;
        }
        public Builder albTargetGroupArn(@Nullable String albTargetGroupArn) {
            this.albTargetGroupArn = Output.ofNullable(albTargetGroupArn);
            return this;
        }
        public Builder autoscalingGroupName(@Nullable Output<String> autoscalingGroupName) {
            this.autoscalingGroupName = autoscalingGroupName;
            return this;
        }
        public Builder autoscalingGroupName(@Nullable String autoscalingGroupName) {
            this.autoscalingGroupName = Output.ofNullable(autoscalingGroupName);
            return this;
        }
        public Builder elb(@Nullable Output<String> elb) {
            this.elb = elb;
            return this;
        }
        public Builder elb(@Nullable String elb) {
            this.elb = Output.ofNullable(elb);
            return this;
        }        public AttachmentState build() {
            return new AttachmentState(albTargetGroupArn, autoscalingGroupName, elb);
        }
    }
}
