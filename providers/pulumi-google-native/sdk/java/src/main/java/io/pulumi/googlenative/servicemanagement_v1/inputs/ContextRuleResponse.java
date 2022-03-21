// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A context rule provides information about the context for an individual API element.
 * 
 */
public final class ContextRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContextRuleResponse Empty = new ContextRuleResponse();

    /**
     * A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
     * 
     */
    @Import(name="allowedRequestExtensions", required=true)
      private final List<String> allowedRequestExtensions;

    public List<String> getAllowedRequestExtensions() {
        return this.allowedRequestExtensions;
    }

    /**
     * A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
     * 
     */
    @Import(name="allowedResponseExtensions", required=true)
      private final List<String> allowedResponseExtensions;

    public List<String> getAllowedResponseExtensions() {
        return this.allowedResponseExtensions;
    }

    /**
     * A list of full type names of provided contexts.
     * 
     */
    @Import(name="provided", required=true)
      private final List<String> provided;

    public List<String> getProvided() {
        return this.provided;
    }

    /**
     * A list of full type names of requested contexts.
     * 
     */
    @Import(name="requested", required=true)
      private final List<String> requested;

    public List<String> getRequested() {
        return this.requested;
    }

    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    @Import(name="selector", required=true)
      private final String selector;

    public String getSelector() {
        return this.selector;
    }

    public ContextRuleResponse(
        List<String> allowedRequestExtensions,
        List<String> allowedResponseExtensions,
        List<String> provided,
        List<String> requested,
        String selector) {
        this.allowedRequestExtensions = Objects.requireNonNull(allowedRequestExtensions, "expected parameter 'allowedRequestExtensions' to be non-null");
        this.allowedResponseExtensions = Objects.requireNonNull(allowedResponseExtensions, "expected parameter 'allowedResponseExtensions' to be non-null");
        this.provided = Objects.requireNonNull(provided, "expected parameter 'provided' to be non-null");
        this.requested = Objects.requireNonNull(requested, "expected parameter 'requested' to be non-null");
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
    }

    private ContextRuleResponse() {
        this.allowedRequestExtensions = List.of();
        this.allowedResponseExtensions = List.of();
        this.provided = List.of();
        this.requested = List.of();
        this.selector = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContextRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedRequestExtensions;
        private List<String> allowedResponseExtensions;
        private List<String> provided;
        private List<String> requested;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(ContextRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRequestExtensions = defaults.allowedRequestExtensions;
    	      this.allowedResponseExtensions = defaults.allowedResponseExtensions;
    	      this.provided = defaults.provided;
    	      this.requested = defaults.requested;
    	      this.selector = defaults.selector;
        }

        public Builder allowedRequestExtensions(List<String> allowedRequestExtensions) {
            this.allowedRequestExtensions = Objects.requireNonNull(allowedRequestExtensions);
            return this;
        }
        public Builder allowedRequestExtensions(String... allowedRequestExtensions) {
            return allowedRequestExtensions(List.of(allowedRequestExtensions));
        }
        public Builder allowedResponseExtensions(List<String> allowedResponseExtensions) {
            this.allowedResponseExtensions = Objects.requireNonNull(allowedResponseExtensions);
            return this;
        }
        public Builder allowedResponseExtensions(String... allowedResponseExtensions) {
            return allowedResponseExtensions(List.of(allowedResponseExtensions));
        }
        public Builder provided(List<String> provided) {
            this.provided = Objects.requireNonNull(provided);
            return this;
        }
        public Builder provided(String... provided) {
            return provided(List.of(provided));
        }
        public Builder requested(List<String> requested) {
            this.requested = Objects.requireNonNull(requested);
            return this;
        }
        public Builder requested(String... requested) {
            return requested(List.of(requested));
        }
        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }        public ContextRuleResponse build() {
            return new ContextRuleResponse(allowedRequestExtensions, allowedResponseExtensions, provided, requested, selector);
        }
    }
}
