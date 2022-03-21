// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dns_v1beta2.inputs.RRSetRoutingPolicyGeoPolicyResponse;
import io.pulumi.googlenative.dns_v1beta2.inputs.RRSetRoutingPolicyWrrPolicyResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A RRSetRoutingPolicy represents ResourceRecordSet data that is returned dynamically with the response varying based on configured properties such as geolocation or by weighted random selection.
 * 
 */
public final class RRSetRoutingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final RRSetRoutingPolicyResponse Empty = new RRSetRoutingPolicyResponse();

    @Import(name="geo", required=true)
      private final RRSetRoutingPolicyGeoPolicyResponse geo;

    public RRSetRoutingPolicyGeoPolicyResponse getGeo() {
        return this.geo;
    }

    @Import(name="geoPolicy", required=true)
      private final RRSetRoutingPolicyGeoPolicyResponse geoPolicy;

    public RRSetRoutingPolicyGeoPolicyResponse getGeoPolicy() {
        return this.geoPolicy;
    }

    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    @Import(name="wrr", required=true)
      private final RRSetRoutingPolicyWrrPolicyResponse wrr;

    public RRSetRoutingPolicyWrrPolicyResponse getWrr() {
        return this.wrr;
    }

    @Import(name="wrrPolicy", required=true)
      private final RRSetRoutingPolicyWrrPolicyResponse wrrPolicy;

    public RRSetRoutingPolicyWrrPolicyResponse getWrrPolicy() {
        return this.wrrPolicy;
    }

    public RRSetRoutingPolicyResponse(
        RRSetRoutingPolicyGeoPolicyResponse geo,
        RRSetRoutingPolicyGeoPolicyResponse geoPolicy,
        String kind,
        RRSetRoutingPolicyWrrPolicyResponse wrr,
        RRSetRoutingPolicyWrrPolicyResponse wrrPolicy) {
        this.geo = Objects.requireNonNull(geo, "expected parameter 'geo' to be non-null");
        this.geoPolicy = Objects.requireNonNull(geoPolicy, "expected parameter 'geoPolicy' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.wrr = Objects.requireNonNull(wrr, "expected parameter 'wrr' to be non-null");
        this.wrrPolicy = Objects.requireNonNull(wrrPolicy, "expected parameter 'wrrPolicy' to be non-null");
    }

    private RRSetRoutingPolicyResponse() {
        this.geo = null;
        this.geoPolicy = null;
        this.kind = null;
        this.wrr = null;
        this.wrrPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RRSetRoutingPolicyGeoPolicyResponse geo;
        private RRSetRoutingPolicyGeoPolicyResponse geoPolicy;
        private String kind;
        private RRSetRoutingPolicyWrrPolicyResponse wrr;
        private RRSetRoutingPolicyWrrPolicyResponse wrrPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geo = defaults.geo;
    	      this.geoPolicy = defaults.geoPolicy;
    	      this.kind = defaults.kind;
    	      this.wrr = defaults.wrr;
    	      this.wrrPolicy = defaults.wrrPolicy;
        }

        public Builder geo(RRSetRoutingPolicyGeoPolicyResponse geo) {
            this.geo = Objects.requireNonNull(geo);
            return this;
        }
        public Builder geoPolicy(RRSetRoutingPolicyGeoPolicyResponse geoPolicy) {
            this.geoPolicy = Objects.requireNonNull(geoPolicy);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder wrr(RRSetRoutingPolicyWrrPolicyResponse wrr) {
            this.wrr = Objects.requireNonNull(wrr);
            return this;
        }
        public Builder wrrPolicy(RRSetRoutingPolicyWrrPolicyResponse wrrPolicy) {
            this.wrrPolicy = Objects.requireNonNull(wrrPolicy);
            return this;
        }        public RRSetRoutingPolicyResponse build() {
            return new RRSetRoutingPolicyResponse(geo, geoPolicy, kind, wrr, wrrPolicy);
        }
    }
}
