// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
 * 
 */
public final class PodDisruptionBudgetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodDisruptionBudgetSpecArgs Empty = new PodDisruptionBudgetSpecArgs();

    /**
     * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * 
     */
    @InputImport(name="maxUnavailable")
      private final @Nullable Input<Either<Integer,String>> maxUnavailable;

    public Input<Either<Integer,String>> getMaxUnavailable() {
        return this.maxUnavailable == null ? Input.empty() : this.maxUnavailable;
    }

    /**
     * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
     * 
     */
    @InputImport(name="minAvailable")
      private final @Nullable Input<Either<Integer,String>> minAvailable;

    public Input<Either<Integer,String>> getMinAvailable() {
        return this.minAvailable == null ? Input.empty() : this.minAvailable;
    }

    /**
     * Label query over pods whose evictions are managed by the disruption budget. A null selector will match no pods, while an empty ({}) selector will select all pods within the namespace.
     * 
     */
    @InputImport(name="selector")
      private final @Nullable Input<LabelSelectorArgs> selector;

    public Input<LabelSelectorArgs> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    public PodDisruptionBudgetSpecArgs(
        @Nullable Input<Either<Integer,String>> maxUnavailable,
        @Nullable Input<Either<Integer,String>> minAvailable,
        @Nullable Input<LabelSelectorArgs> selector) {
        this.maxUnavailable = maxUnavailable;
        this.minAvailable = minAvailable;
        this.selector = selector;
    }

    private PodDisruptionBudgetSpecArgs() {
        this.maxUnavailable = Input.empty();
        this.minAvailable = Input.empty();
        this.selector = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodDisruptionBudgetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<Integer,String>> maxUnavailable;
        private @Nullable Input<Either<Integer,String>> minAvailable;
        private @Nullable Input<LabelSelectorArgs> selector;

        public Builder() {
    	      // Empty
        }

        public Builder(PodDisruptionBudgetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.minAvailable = defaults.minAvailable;
    	      this.selector = defaults.selector;
        }

        public Builder setMaxUnavailable(@Nullable Input<Either<Integer,String>> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        public Builder setMaxUnavailable(@Nullable Either<Integer,String> maxUnavailable) {
            this.maxUnavailable = Input.ofNullable(maxUnavailable);
            return this;
        }

        public Builder setMinAvailable(@Nullable Input<Either<Integer,String>> minAvailable) {
            this.minAvailable = minAvailable;
            return this;
        }

        public Builder setMinAvailable(@Nullable Either<Integer,String> minAvailable) {
            this.minAvailable = Input.ofNullable(minAvailable);
            return this;
        }

        public Builder setSelector(@Nullable Input<LabelSelectorArgs> selector) {
            this.selector = selector;
            return this;
        }

        public Builder setSelector(@Nullable LabelSelectorArgs selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }
        public PodDisruptionBudgetSpecArgs build() {
            return new PodDisruptionBudgetSpecArgs(maxUnavailable, minAvailable, selector);
        }
    }
}
