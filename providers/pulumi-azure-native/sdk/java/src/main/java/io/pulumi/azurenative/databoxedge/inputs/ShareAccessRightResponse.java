// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the mapping between this particular user and the type of access he has on shares on this device.
 * 
 */
public final class ShareAccessRightResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShareAccessRightResponse Empty = new ShareAccessRightResponse();

    /**
     * Type of access to be allowed on the share for this user.
     * 
     */
    @Import(name="accessType", required=true)
      private final String accessType;

    public String getAccessType() {
        return this.accessType;
    }

    /**
     * The share ID.
     * 
     */
    @Import(name="shareId", required=true)
      private final String shareId;

    public String getShareId() {
        return this.shareId;
    }

    public ShareAccessRightResponse(
        String accessType,
        String shareId) {
        this.accessType = Objects.requireNonNull(accessType, "expected parameter 'accessType' to be non-null");
        this.shareId = Objects.requireNonNull(shareId, "expected parameter 'shareId' to be non-null");
    }

    private ShareAccessRightResponse() {
        this.accessType = null;
        this.shareId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareAccessRightResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessType;
        private String shareId;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareAccessRightResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.shareId = defaults.shareId;
        }

        public Builder accessType(String accessType) {
            this.accessType = Objects.requireNonNull(accessType);
            return this;
        }
        public Builder shareId(String shareId) {
            this.shareId = Objects.requireNonNull(shareId);
            return this;
        }        public ShareAccessRightResponse build() {
            return new ShareAccessRightResponse(accessType, shareId);
        }
    }
}
