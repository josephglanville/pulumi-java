// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.OracleRdbmsResponse;
import java.util.Objects;


public final class OracleSourceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final OracleSourceConfigResponse Empty = new OracleSourceConfigResponse();

    @InputImport(name="allowlist", required=true)
    private final OracleRdbmsResponse allowlist;

    public OracleRdbmsResponse getAllowlist() {
        return this.allowlist;
    }

    @InputImport(name="rejectlist", required=true)
    private final OracleRdbmsResponse rejectlist;

    public OracleRdbmsResponse getRejectlist() {
        return this.rejectlist;
    }

    public OracleSourceConfigResponse(
        OracleRdbmsResponse allowlist,
        OracleRdbmsResponse rejectlist) {
        this.allowlist = Objects.requireNonNull(allowlist, "expected parameter 'allowlist' to be non-null");
        this.rejectlist = Objects.requireNonNull(rejectlist, "expected parameter 'rejectlist' to be non-null");
    }

    private OracleSourceConfigResponse() {
        this.allowlist = null;
        this.rejectlist = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleRdbmsResponse allowlist;
        private OracleRdbmsResponse rejectlist;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlist = defaults.allowlist;
    	      this.rejectlist = defaults.rejectlist;
        }

        public Builder setAllowlist(OracleRdbmsResponse allowlist) {
            this.allowlist = Objects.requireNonNull(allowlist);
            return this;
        }

        public Builder setRejectlist(OracleRdbmsResponse rejectlist) {
            this.rejectlist = Objects.requireNonNull(rejectlist);
            return this;
        }

        public OracleSourceConfigResponse build() {
            return new OracleSourceConfigResponse(allowlist, rejectlist);
        }
    }
}