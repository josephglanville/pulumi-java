// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.run_v1alpha1.inputs.InstanceStatusArgs;
import io.pulumi.googlenative.run_v1alpha1.inputs.JobConditionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * JobStatus represents the current state of a Job.
 * 
 */
public final class JobStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatusArgs Empty = new JobStatusArgs();

    /**
     * Optional. The number of actively running instances. +optional
     * 
     */
    @Import(name="active")
      private final @Nullable Output<Integer> active;

    public Output<Integer> getActive() {
        return this.active == null ? Codegen.empty() : this.active;
    }

    /**
     * Optional. Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @Import(name="completionTime")
      private final @Nullable Output<String> completionTime;

    public Output<String> getCompletionTime() {
        return this.completionTime == null ? Codegen.empty() : this.completionTime;
    }

    /**
     * Optional. The latest available observations of a job's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<JobConditionArgs>> conditions;

    public Output<List<JobConditionArgs>> getConditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * Optional. The number of instances which reached phase Failed. +optional
     * 
     */
    @Import(name="failed")
      private final @Nullable Output<Integer> failed;

    public Output<Integer> getFailed() {
        return this.failed == null ? Codegen.empty() : this.failed;
    }

    /**
     * Optional. ImageDigest holds the resolved digest for the image specified within .Spec.Template.Spec.Container.Image. The digest is resolved during the creation of the Job. This field holds the digest value regardless of whether a tag or digest was originally specified in the Container object.
     * 
     */
    @Import(name="imageDigest")
      private final @Nullable Output<String> imageDigest;

    public Output<String> getImageDigest() {
        return this.imageDigest == null ? Codegen.empty() : this.imageDigest;
    }

    /**
     * Optional. Status of completed, failed, and running instances. +optional
     * 
     */
    @Import(name="instances")
      private final @Nullable Output<List<InstanceStatusArgs>> instances;

    public Output<List<InstanceStatusArgs>> getInstances() {
        return this.instances == null ? Codegen.empty() : this.instances;
    }

    /**
     * Optional. The 'generation' of the job that was last processed by the controller.
     * 
     */
    @Import(name="observedGeneration")
      private final @Nullable Output<Integer> observedGeneration;

    public Output<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Codegen.empty() : this.observedGeneration;
    }

    /**
     * Optional. Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    /**
     * Optional. The number of instances which reached phase Succeeded. +optional
     * 
     */
    @Import(name="succeeded")
      private final @Nullable Output<Integer> succeeded;

    public Output<Integer> getSucceeded() {
        return this.succeeded == null ? Codegen.empty() : this.succeeded;
    }

    public JobStatusArgs(
        @Nullable Output<Integer> active,
        @Nullable Output<String> completionTime,
        @Nullable Output<List<JobConditionArgs>> conditions,
        @Nullable Output<Integer> failed,
        @Nullable Output<String> imageDigest,
        @Nullable Output<List<InstanceStatusArgs>> instances,
        @Nullable Output<Integer> observedGeneration,
        @Nullable Output<String> startTime,
        @Nullable Output<Integer> succeeded) {
        this.active = active;
        this.completionTime = completionTime;
        this.conditions = conditions;
        this.failed = failed;
        this.imageDigest = imageDigest;
        this.instances = instances;
        this.observedGeneration = observedGeneration;
        this.startTime = startTime;
        this.succeeded = succeeded;
    }

    private JobStatusArgs() {
        this.active = Codegen.empty();
        this.completionTime = Codegen.empty();
        this.conditions = Codegen.empty();
        this.failed = Codegen.empty();
        this.imageDigest = Codegen.empty();
        this.instances = Codegen.empty();
        this.observedGeneration = Codegen.empty();
        this.startTime = Codegen.empty();
        this.succeeded = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> active;
        private @Nullable Output<String> completionTime;
        private @Nullable Output<List<JobConditionArgs>> conditions;
        private @Nullable Output<Integer> failed;
        private @Nullable Output<String> imageDigest;
        private @Nullable Output<List<InstanceStatusArgs>> instances;
        private @Nullable Output<Integer> observedGeneration;
        private @Nullable Output<String> startTime;
        private @Nullable Output<Integer> succeeded;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.completionTime = defaults.completionTime;
    	      this.conditions = defaults.conditions;
    	      this.failed = defaults.failed;
    	      this.imageDigest = defaults.imageDigest;
    	      this.instances = defaults.instances;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.startTime = defaults.startTime;
    	      this.succeeded = defaults.succeeded;
        }

        public Builder active(@Nullable Output<Integer> active) {
            this.active = active;
            return this;
        }
        public Builder active(@Nullable Integer active) {
            this.active = Codegen.ofNullable(active);
            return this;
        }
        public Builder completionTime(@Nullable Output<String> completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public Builder completionTime(@Nullable String completionTime) {
            this.completionTime = Codegen.ofNullable(completionTime);
            return this;
        }
        public Builder conditions(@Nullable Output<List<JobConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<JobConditionArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(JobConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder failed(@Nullable Output<Integer> failed) {
            this.failed = failed;
            return this;
        }
        public Builder failed(@Nullable Integer failed) {
            this.failed = Codegen.ofNullable(failed);
            return this;
        }
        public Builder imageDigest(@Nullable Output<String> imageDigest) {
            this.imageDigest = imageDigest;
            return this;
        }
        public Builder imageDigest(@Nullable String imageDigest) {
            this.imageDigest = Codegen.ofNullable(imageDigest);
            return this;
        }
        public Builder instances(@Nullable Output<List<InstanceStatusArgs>> instances) {
            this.instances = instances;
            return this;
        }
        public Builder instances(@Nullable List<InstanceStatusArgs> instances) {
            this.instances = Codegen.ofNullable(instances);
            return this;
        }
        public Builder instances(InstanceStatusArgs... instances) {
            return instances(List.of(instances));
        }
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Codegen.ofNullable(observedGeneration);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }
        public Builder succeeded(@Nullable Output<Integer> succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Builder succeeded(@Nullable Integer succeeded) {
            this.succeeded = Codegen.ofNullable(succeeded);
            return this;
        }        public JobStatusArgs build() {
            return new JobStatusArgs(active, completionTime, conditions, failed, imageDigest, instances, observedGeneration, startTime, succeeded);
        }
    }
}
