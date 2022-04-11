// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetGroupAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final TargetGroupAttachmentState Empty = new TargetGroupAttachmentState();

    /**
     * The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    /**
     * The port on which targets receive traffic.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The ARN of the target group with which to register targets
     * 
     */
    @Import(name="targetGroupArn")
      private final @Nullable Output<String> targetGroupArn;

    public Output<String> getTargetGroupArn() {
        return this.targetGroupArn == null ? Codegen.empty() : this.targetGroupArn;
    }

    /**
     * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda. If the target type is alb, specify the arn of alb.
     * 
     */
    @Import(name="targetId")
      private final @Nullable Output<String> targetId;

    public Output<String> getTargetId() {
        return this.targetId == null ? Codegen.empty() : this.targetId;
    }

    public TargetGroupAttachmentState(
        @Nullable Output<String> availabilityZone,
        @Nullable Output<Integer> port,
        @Nullable Output<String> targetGroupArn,
        @Nullable Output<String> targetId) {
        this.availabilityZone = availabilityZone;
        this.port = port;
        this.targetGroupArn = targetGroupArn;
        this.targetId = targetId;
    }

    private TargetGroupAttachmentState() {
        this.availabilityZone = Codegen.empty();
        this.port = Codegen.empty();
        this.targetGroupArn = Codegen.empty();
        this.targetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGroupAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> targetGroupArn;
        private @Nullable Output<String> targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGroupAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.port = defaults.port;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.targetId = defaults.targetId;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = Codegen.ofNullable(targetGroupArn);
            return this;
        }
        public Builder targetId(@Nullable Output<String> targetId) {
            this.targetId = targetId;
            return this;
        }
        public Builder targetId(@Nullable String targetId) {
            this.targetId = Codegen.ofNullable(targetId);
            return this;
        }        public TargetGroupAttachmentState build() {
            return new TargetGroupAttachmentState(availabilityZone, port, targetGroupArn, targetId);
        }
    }
}
