// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPortalArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPortalArgs Empty = new GetPortalArgs();

    /**
     * The ID of the portal.
     * 
     */
    @Import(name="portalId", required=true)
      private final String portalId;

    public String getPortalId() {
        return this.portalId;
    }

    public GetPortalArgs(String portalId) {
        this.portalId = Objects.requireNonNull(portalId, "expected parameter 'portalId' to be non-null");
    }

    private GetPortalArgs() {
        this.portalId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String portalId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPortalArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portalId = defaults.portalId;
        }

        public Builder portalId(String portalId) {
            this.portalId = Objects.requireNonNull(portalId);
            return this;
        }        public GetPortalArgs build() {
            return new GetPortalArgs(portalId);
        }
    }
}
