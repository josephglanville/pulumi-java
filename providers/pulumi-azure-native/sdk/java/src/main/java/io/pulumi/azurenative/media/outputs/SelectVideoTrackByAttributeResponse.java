// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SelectVideoTrackByAttributeResponse {
    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    private final String attribute;
    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    private final String filter;
    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property. For TrackAttribute.Bitrate, this should be an integer value in bits per second (e.g: '1500000').  The TrackAttribute.Language is not supported for video tracks.
     * 
     */
    private final @Nullable String filterValue;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectVideoTrackByAttribute'.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private SelectVideoTrackByAttributeResponse(
        @CustomType.Parameter("attribute") String attribute,
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("filterValue") @Nullable String filterValue,
        @CustomType.Parameter("odataType") String odataType) {
        this.attribute = attribute;
        this.filter = filter;
        this.filterValue = filterValue;
        this.odataType = odataType;
    }

    /**
     * The TrackAttribute to filter the tracks by.
     * 
    */
    public String getAttribute() {
        return this.attribute;
    }
    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
    */
    public String getFilter() {
        return this.filter;
    }
    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property. For TrackAttribute.Bitrate, this should be an integer value in bits per second (e.g: '1500000').  The TrackAttribute.Language is not supported for video tracks.
     * 
    */
    public Optional<String> getFilterValue() {
        return Optional.ofNullable(this.filterValue);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectVideoTrackByAttribute'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectVideoTrackByAttributeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attribute;
        private String filter;
        private @Nullable String filterValue;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectVideoTrackByAttributeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.filter = defaults.filter;
    	      this.filterValue = defaults.filterValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filterValue(@Nullable String filterValue) {
            this.filterValue = filterValue;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public SelectVideoTrackByAttributeResponse build() {
            return new SelectVideoTrackByAttributeResponse(attribute, filter, filterValue, odataType);
        }
    }
}
