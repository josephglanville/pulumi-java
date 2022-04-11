// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapHostRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapHostRuleGetArgs Empty = new RegionUrlMapHostRuleGetArgs();

    /**
     * Description of this test case.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The list of host patterns to match. They must be valid
     * hostnames, except * will match any string of ([a-z0-9-.]*). In
     * that case, * must be the first character and must be followed in
     * the pattern by either - or ..
     * 
     */
    @Import(name="hosts", required=true)
      private final Output<List<String>> hosts;

    public Output<List<String>> getHosts() {
        return this.hosts;
    }

    /**
     * The name of the PathMatcher to use to match the path portion of
     * the URL if the hostRule matches the URL's host portion.
     * 
     */
    @Import(name="pathMatcher", required=true)
      private final Output<String> pathMatcher;

    public Output<String> getPathMatcher() {
        return this.pathMatcher;
    }

    public RegionUrlMapHostRuleGetArgs(
        @Nullable Output<String> description,
        Output<List<String>> hosts,
        Output<String> pathMatcher) {
        this.description = description;
        this.hosts = Objects.requireNonNull(hosts, "expected parameter 'hosts' to be non-null");
        this.pathMatcher = Objects.requireNonNull(pathMatcher, "expected parameter 'pathMatcher' to be non-null");
    }

    private RegionUrlMapHostRuleGetArgs() {
        this.description = Codegen.empty();
        this.hosts = Codegen.empty();
        this.pathMatcher = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapHostRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<List<String>> hosts;
        private Output<String> pathMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapHostRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hosts = defaults.hosts;
    	      this.pathMatcher = defaults.pathMatcher;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder hosts(Output<List<String>> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }
        public Builder hosts(List<String> hosts) {
            this.hosts = Output.of(Objects.requireNonNull(hosts));
            return this;
        }
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }
        public Builder pathMatcher(Output<String> pathMatcher) {
            this.pathMatcher = Objects.requireNonNull(pathMatcher);
            return this;
        }
        public Builder pathMatcher(String pathMatcher) {
            this.pathMatcher = Output.of(Objects.requireNonNull(pathMatcher));
            return this;
        }        public RegionUrlMapHostRuleGetArgs build() {
            return new RegionUrlMapHostRuleGetArgs(description, hosts, pathMatcher);
        }
    }
}
