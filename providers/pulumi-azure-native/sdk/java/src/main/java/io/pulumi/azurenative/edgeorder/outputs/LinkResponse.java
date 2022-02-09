// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LinkResponse {
    private final String linkType;
    private final String linkUrl;

    @OutputCustomType.Constructor({"linkType","linkUrl"})
    private LinkResponse(
        String linkType,
        String linkUrl) {
        this.linkType = Objects.requireNonNull(linkType);
        this.linkUrl = Objects.requireNonNull(linkUrl);
    }

    public String getLinkType() {
        return this.linkType;
    }
    public String getLinkUrl() {
        return this.linkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String linkType;
        private String linkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkType = defaults.linkType;
    	      this.linkUrl = defaults.linkUrl;
        }

        public Builder setLinkType(String linkType) {
            this.linkType = Objects.requireNonNull(linkType);
            return this;
        }

        public Builder setLinkUrl(String linkUrl) {
            this.linkUrl = Objects.requireNonNull(linkUrl);
            return this;
        }

        public LinkResponse build() {
            return new LinkResponse(linkType, linkUrl);
        }
    }
}
