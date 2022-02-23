// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Select video tracks from the input by specifying an attribute and an attribute filter.
 * 
 */
public final class SelectVideoTrackByAttributeResponse extends io.pulumi.resources.InvokeArgs {

    public static final SelectVideoTrackByAttributeResponse Empty = new SelectVideoTrackByAttributeResponse();

    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    @InputImport(name="attribute", required=true)
      private final String attribute;

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    @InputImport(name="filter", required=true)
      private final String filter;

    public String getFilter() {
        return this.filter;
    }

    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property. For TrackAttribute.Bitrate, this should be an integer value in bits per second (e.g: '1500000').  The TrackAttribute.Language is not supported for video tracks.
     * 
     */
    @InputImport(name="filterValue")
      private final @Nullable String filterValue;

    public Optional<String> getFilterValue() {
        return this.filterValue == null ? Optional.empty() : Optional.ofNullable(this.filterValue);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectVideoTrackByAttribute'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public SelectVideoTrackByAttributeResponse(
        String attribute,
        String filter,
        @Nullable String filterValue,
        String odataType) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.filterValue = filterValue;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private SelectVideoTrackByAttributeResponse() {
        this.attribute = null;
        this.filter = null;
        this.filterValue = null;
        this.odataType = null;
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

        public Builder setAttribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilterValue(@Nullable String filterValue) {
            this.filterValue = filterValue;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public SelectVideoTrackByAttributeResponse build() {
            return new SelectVideoTrackByAttributeResponse(attribute, filter, filterValue, odataType);
        }
    }
}
