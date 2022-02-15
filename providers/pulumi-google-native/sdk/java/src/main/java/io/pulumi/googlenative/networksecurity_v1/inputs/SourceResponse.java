// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceResponse Empty = new SourceResponse();

    @InputImport(name="ipBlocks", required=true)
    private final List<String> ipBlocks;

    public List<String> getIpBlocks() {
        return this.ipBlocks;
    }

    @InputImport(name="principals", required=true)
    private final List<String> principals;

    public List<String> getPrincipals() {
        return this.principals;
    }

    public SourceResponse(
        List<String> ipBlocks,
        List<String> principals) {
        this.ipBlocks = Objects.requireNonNull(ipBlocks, "expected parameter 'ipBlocks' to be non-null");
        this.principals = Objects.requireNonNull(principals, "expected parameter 'principals' to be non-null");
    }

    private SourceResponse() {
        this.ipBlocks = List.of();
        this.principals = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> ipBlocks;
        private List<String> principals;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipBlocks = defaults.ipBlocks;
    	      this.principals = defaults.principals;
        }

        public Builder setIpBlocks(List<String> ipBlocks) {
            this.ipBlocks = Objects.requireNonNull(ipBlocks);
            return this;
        }

        public Builder setPrincipals(List<String> principals) {
            this.principals = Objects.requireNonNull(principals);
            return this;
        }

        public SourceResponse build() {
            return new SourceResponse(ipBlocks, principals);
        }
    }
}