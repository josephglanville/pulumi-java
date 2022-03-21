// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies that the scope of the extensionInstance is Namespace
 * 
 */
public final class ScopeNamespaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScopeNamespaceResponse Empty = new ScopeNamespaceResponse();

    /**
     * Namespace where the extensionInstance will be created for an Namespace scoped extensionInstance.  If this namespace does not exist, it will be created
     * 
     */
    @Import(name="targetNamespace")
      private final @Nullable String targetNamespace;

    public Optional<String> getTargetNamespace() {
        return this.targetNamespace == null ? Optional.empty() : Optional.ofNullable(this.targetNamespace);
    }

    public ScopeNamespaceResponse(@Nullable String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    private ScopeNamespaceResponse() {
        this.targetNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeNamespaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeNamespaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder targetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }        public ScopeNamespaceResponse build() {
            return new ScopeNamespaceResponse(targetNamespace);
        }
    }
}
