// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LinkResponse {
    /**
     * @return Type of link
     * 
     */
    private String linkType;
    /**
     * @return Url of the link
     * 
     */
    private String linkUrl;

    private LinkResponse() {}
    /**
     * @return Type of link
     * 
     */
    public String linkType() {
        return this.linkType;
    }
    /**
     * @return Url of the link
     * 
     */
    public String linkUrl() {
        return this.linkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String linkType;
        private String linkUrl;
        public Builder() {}
        public Builder(LinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkType = defaults.linkType;
    	      this.linkUrl = defaults.linkUrl;
        }

        @CustomType.Setter
        public Builder linkType(String linkType) {
            this.linkType = linkType;
            return this;
        }
        @CustomType.Setter
        public Builder linkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
            return this;
        }
        public LinkResponse build() {
            final var o = new LinkResponse();
            o.linkType = linkType;
            o.linkUrl = linkUrl;
            return o;
        }
    }
}
