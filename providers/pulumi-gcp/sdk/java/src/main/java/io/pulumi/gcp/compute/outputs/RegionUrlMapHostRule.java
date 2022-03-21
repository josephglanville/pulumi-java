// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapHostRule {
    /**
     * Description of this test case.
     * 
     */
    private final @Nullable String description;
    /**
     * The list of host patterns to match. They must be valid
     * hostnames, except * will match any string of ([a-z0-9-.]*). In
     * that case, * must be the first character and must be followed in
     * the pattern by either - or ..
     * 
     */
    private final List<String> hosts;
    /**
     * The name of the PathMatcher to use to match the path portion of
     * the URL if the hostRule matches the URL's host portion.
     * 
     */
    private final String pathMatcher;

    @CustomType.Constructor
    private RegionUrlMapHostRule(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("hosts") List<String> hosts,
        @CustomType.Parameter("pathMatcher") String pathMatcher) {
        this.description = description;
        this.hosts = hosts;
        this.pathMatcher = pathMatcher;
    }

    /**
     * Description of this test case.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The list of host patterns to match. They must be valid
     * hostnames, except * will match any string of ([a-z0-9-.]*). In
     * that case, * must be the first character and must be followed in
     * the pattern by either - or ..
     * 
    */
    public List<String> getHosts() {
        return this.hosts;
    }
    /**
     * The name of the PathMatcher to use to match the path portion of
     * the URL if the hostRule matches the URL's host portion.
     * 
    */
    public String getPathMatcher() {
        return this.pathMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapHostRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private List<String> hosts;
        private String pathMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapHostRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hosts = defaults.hosts;
    	      this.pathMatcher = defaults.pathMatcher;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder hosts(List<String> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }
        public Builder pathMatcher(String pathMatcher) {
            this.pathMatcher = Objects.requireNonNull(pathMatcher);
            return this;
        }        public RegionUrlMapHostRule build() {
            return new RegionUrlMapHostRule(description, hosts, pathMatcher);
        }
    }
}
