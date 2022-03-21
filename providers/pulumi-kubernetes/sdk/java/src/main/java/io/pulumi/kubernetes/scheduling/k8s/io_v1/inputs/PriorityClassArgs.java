// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.scheduling.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
 * 
 */
public final class PriorityClassArgs extends io.pulumi.resources.ResourceArgs {

    public static final PriorityClassArgs Empty = new PriorityClassArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    /**
     * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
     * 
     */
    @Import(name="globalDefault")
      private final @Nullable Output<Boolean> globalDefault;

    public Output<Boolean> getGlobalDefault() {
        return this.globalDefault == null ? Output.empty() : this.globalDefault;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * 
     */
    @Import(name="preemptionPolicy")
      private final @Nullable Output<String> preemptionPolicy;

    public Output<String> getPreemptionPolicy() {
        return this.preemptionPolicy == null ? Output.empty() : this.preemptionPolicy;
    }

    /**
     * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
     * 
     */
    @Import(name="value", required=true)
      private final Output<Integer> value;

    public Output<Integer> getValue() {
        return this.value;
    }

    public PriorityClassArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> globalDefault,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<String> preemptionPolicy,
        Output<Integer> value) {
        this.apiVersion = apiVersion;
        this.description = description;
        this.globalDefault = globalDefault;
        this.kind = kind;
        this.metadata = metadata;
        this.preemptionPolicy = preemptionPolicy;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private PriorityClassArgs() {
        this.apiVersion = Output.empty();
        this.description = Output.empty();
        this.globalDefault = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
        this.preemptionPolicy = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> globalDefault;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<String> preemptionPolicy;
        private Output<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityClassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.description = defaults.description;
    	      this.globalDefault = defaults.globalDefault;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.preemptionPolicy = defaults.preemptionPolicy;
    	      this.value = defaults.value;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder globalDefault(@Nullable Output<Boolean> globalDefault) {
            this.globalDefault = globalDefault;
            return this;
        }
        public Builder globalDefault(@Nullable Boolean globalDefault) {
            this.globalDefault = Output.ofNullable(globalDefault);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder preemptionPolicy(@Nullable Output<String> preemptionPolicy) {
            this.preemptionPolicy = preemptionPolicy;
            return this;
        }
        public Builder preemptionPolicy(@Nullable String preemptionPolicy) {
            this.preemptionPolicy = Output.ofNullable(preemptionPolicy);
            return this;
        }
        public Builder value(Output<Integer> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(Integer value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public PriorityClassArgs build() {
            return new PriorityClassArgs(apiVersion, description, globalDefault, kind, metadata, preemptionPolicy, value);
        }
    }
}
