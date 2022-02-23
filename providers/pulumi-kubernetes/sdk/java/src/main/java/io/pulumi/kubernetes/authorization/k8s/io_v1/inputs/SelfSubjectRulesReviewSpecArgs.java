// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="namespace")
      private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public SelfSubjectRulesReviewSpecArgs(@Nullable Input<String> namespace) {
        this.namespace = namespace;
    }

    private SelfSubjectRulesReviewSpecArgs() {
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfSubjectRulesReviewSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfSubjectRulesReviewSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }
        public SelfSubjectRulesReviewSpecArgs build() {
            return new SelfSubjectRulesReviewSpecArgs(namespace);
        }
    }
}
