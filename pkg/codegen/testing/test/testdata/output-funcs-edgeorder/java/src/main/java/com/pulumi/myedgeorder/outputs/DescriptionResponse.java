// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.myedgeorder.outputs.LinkResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DescriptionResponse {
    /**
     * @return Attributes for the product system.
     * 
     */
    private List<String> attributes;
    /**
     * @return Type of description.
     * 
     */
    private String descriptionType;
    /**
     * @return Keywords for the product system.
     * 
     */
    private List<String> keywords;
    /**
     * @return Links for the product system.
     * 
     */
    private List<LinkResponse> links;
    /**
     * @return Long description of the product system.
     * 
     */
    private String longDescription;
    /**
     * @return Short description of the product system.
     * 
     */
    private String shortDescription;

    private DescriptionResponse() {}
    /**
     * @return Attributes for the product system.
     * 
     */
    public List<String> attributes() {
        return this.attributes;
    }
    /**
     * @return Type of description.
     * 
     */
    public String descriptionType() {
        return this.descriptionType;
    }
    /**
     * @return Keywords for the product system.
     * 
     */
    public List<String> keywords() {
        return this.keywords;
    }
    /**
     * @return Links for the product system.
     * 
     */
    public List<LinkResponse> links() {
        return this.links;
    }
    /**
     * @return Long description of the product system.
     * 
     */
    public String longDescription() {
        return this.longDescription;
    }
    /**
     * @return Short description of the product system.
     * 
     */
    public String shortDescription() {
        return this.shortDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DescriptionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> attributes;
        private String descriptionType;
        private List<String> keywords;
        private List<LinkResponse> links;
        private String longDescription;
        private String shortDescription;
        public Builder() {}
        public Builder(DescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.descriptionType = defaults.descriptionType;
    	      this.keywords = defaults.keywords;
    	      this.links = defaults.links;
    	      this.longDescription = defaults.longDescription;
    	      this.shortDescription = defaults.shortDescription;
        }

        @CustomType.Setter
        public Builder attributes(List<String> attributes) {
            if (attributes == null) {
              throw new MissingRequiredPropertyException("DescriptionResponse", "attributes");
            }
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(String... attributes) {
            return attributes(List.of(attributes));
        }
        @CustomType.Setter
        public Builder descriptionType(String descriptionType) {
            if (descriptionType == null) {
              throw new MissingRequiredPropertyException("DescriptionResponse", "descriptionType");
            }
            this.descriptionType = descriptionType;
            return this;
        }
        @CustomType.Setter
        public Builder keywords(List<String> keywords) {
            if (keywords == null) {
              throw new MissingRequiredPropertyException("DescriptionResponse", "keywords");
            }
            this.keywords = keywords;
            return this;
        }
        public Builder keywords(String... keywords) {
            return keywords(List.of(keywords));
        }
        @CustomType.Setter
        public Builder links(List<LinkResponse> links) {
            if (links == null) {
              throw new MissingRequiredPropertyException("DescriptionResponse", "links");
            }
            this.links = links;
            return this;
        }
        public Builder links(LinkResponse... links) {
            return links(List.of(links));
        }
        @CustomType.Setter
        public Builder longDescription(String longDescription) {
            if (longDescription == null) {
              throw new MissingRequiredPropertyException("DescriptionResponse", "longDescription");
            }
            this.longDescription = longDescription;
            return this;
        }
        @CustomType.Setter
        public Builder shortDescription(String shortDescription) {
            if (shortDescription == null) {
              throw new MissingRequiredPropertyException("DescriptionResponse", "shortDescription");
            }
            this.shortDescription = shortDescription;
            return this;
        }
        public DescriptionResponse build() {
            final var _resultValue = new DescriptionResponse();
            _resultValue.attributes = attributes;
            _resultValue.descriptionType = descriptionType;
            _resultValue.keywords = keywords;
            _resultValue.links = links;
            _resultValue.longDescription = longDescription;
            _resultValue.shortDescription = shortDescription;
            return _resultValue;
        }
    }
}
