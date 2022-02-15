// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NamespaceSpec {
    private final @Nullable List<String> finalizers;

    @OutputCustomType.Constructor({"finalizers"})
    private NamespaceSpec(@Nullable List<String> finalizers) {
        this.finalizers = finalizers;
    }

    public List<String> getFinalizers() {
        return this.finalizers == null ? List.of() : this.finalizers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> finalizers;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.finalizers = defaults.finalizers;
        }

        public Builder setFinalizers(@Nullable List<String> finalizers) {
            this.finalizers = finalizers;
            return this;
        }

        public NamespaceSpec build() {
            return new NamespaceSpec(finalizers);
        }
    }
}