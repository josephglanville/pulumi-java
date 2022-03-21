// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Information for an interconnect attachment when this belongs to an interconnect of type DEDICATED.
 * 
 */
public final class InterconnectAttachmentPrivateInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final InterconnectAttachmentPrivateInfoResponse Empty = new InterconnectAttachmentPrivateInfoResponse();

    /**
     * 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
     * 
     */
    @Import(name="tag8021q", required=true)
      private final Integer tag8021q;

    public Integer getTag8021q() {
        return this.tag8021q;
    }

    public InterconnectAttachmentPrivateInfoResponse(Integer tag8021q) {
        this.tag8021q = Objects.requireNonNull(tag8021q, "expected parameter 'tag8021q' to be non-null");
    }

    private InterconnectAttachmentPrivateInfoResponse() {
        this.tag8021q = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectAttachmentPrivateInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer tag8021q;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectAttachmentPrivateInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tag8021q = defaults.tag8021q;
        }

        public Builder tag8021q(Integer tag8021q) {
            this.tag8021q = Objects.requireNonNull(tag8021q);
            return this;
        }        public InterconnectAttachmentPrivateInfoResponse build() {
            return new InterconnectAttachmentPrivateInfoResponse(tag8021q);
        }
    }
}
