// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SelfSubjectRulesReviewSpec defines the specification for SelfSubjectRulesReview.
 * 
 */
public final class SelfSubjectRulesReviewSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelfSubjectRulesReviewSpecArgs Empty = new SelfSubjectRulesReviewSpecArgs();

    /**
     * Namespace to evaluate rules for. Required.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Output.empty() : this.namespace;
    }

    public SelfSubjectRulesReviewSpecArgs(@Nullable Output<String> namespace) {
        this.namespace = namespace;
    }

    private SelfSubjectRulesReviewSpecArgs() {
        this.namespace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfSubjectRulesReviewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfSubjectRulesReviewSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Output.ofNullable(namespace);
            return this;
        }        public SelfSubjectRulesReviewSpecArgs build() {
            return new SelfSubjectRulesReviewSpecArgs(namespace);
        }
    }
}
