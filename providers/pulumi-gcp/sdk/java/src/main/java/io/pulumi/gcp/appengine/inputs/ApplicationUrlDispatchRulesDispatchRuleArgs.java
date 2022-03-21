// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationUrlDispatchRulesDispatchRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationUrlDispatchRulesDispatchRuleArgs Empty = new ApplicationUrlDispatchRulesDispatchRuleArgs();

    /**
     * Domain name to match against. The wildcard "*" is supported if specified before a period: "*.".
     * Defaults to matching all domains: "*".
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Output.empty() : this.domain;
    }

    /**
     * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.
     * The sum of the lengths of the domain and path may not exceed 100 characters.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }

    /**
     * Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.
     * The sum of the lengths of the domain and path may not exceed 100 characters.
     * 
     */
    @Import(name="service", required=true)
      private final Output<String> service;

    public Output<String> getService() {
        return this.service;
    }

    public ApplicationUrlDispatchRulesDispatchRuleArgs(
        @Nullable Output<String> domain,
        Output<String> path,
        Output<String> service) {
        this.domain = domain;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private ApplicationUrlDispatchRulesDispatchRuleArgs() {
        this.domain = Output.empty();
        this.path = Output.empty();
        this.service = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUrlDispatchRulesDispatchRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domain;
        private Output<String> path;
        private Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationUrlDispatchRulesDispatchRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Output.ofNullable(domain);
            return this;
        }
        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }
        public Builder service(Output<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder service(String service) {
            this.service = Output.of(Objects.requireNonNull(service));
            return this;
        }        public ApplicationUrlDispatchRulesDispatchRuleArgs build() {
            return new ApplicationUrlDispatchRulesDispatchRuleArgs(domain, path, service);
        }
    }
}
