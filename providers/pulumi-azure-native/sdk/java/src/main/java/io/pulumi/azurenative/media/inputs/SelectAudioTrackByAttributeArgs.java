// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.AttributeFilter;
import io.pulumi.azurenative.media.enums.ChannelMapping;
import io.pulumi.azurenative.media.enums.TrackAttribute;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Select audio tracks from the input by specifying an attribute and an attribute filter.
 * 
 */
public final class SelectAudioTrackByAttributeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelectAudioTrackByAttributeArgs Empty = new SelectAudioTrackByAttributeArgs();

    /**
     * The TrackAttribute to filter the tracks by.
     * 
     */
    @InputImport(name="attribute", required=true)
      private final Input<Either<String,TrackAttribute>> attribute;

    public Input<Either<String,TrackAttribute>> getAttribute() {
        return this.attribute;
    }

    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
     */
    @InputImport(name="channelMapping")
      private final @Nullable Input<Either<String,ChannelMapping>> channelMapping;

    public Input<Either<String,ChannelMapping>> getChannelMapping() {
        return this.channelMapping == null ? Input.empty() : this.channelMapping;
    }

    /**
     * The type of AttributeFilter to apply to the TrackAttribute in order to select the tracks.
     * 
     */
    @InputImport(name="filter", required=true)
      private final Input<Either<String,AttributeFilter>> filter;

    public Input<Either<String,AttributeFilter>> getFilter() {
        return this.filter;
    }

    /**
     * The value to filter the tracks by.  Only used when AttributeFilter.ValueEquals is specified for the Filter property.
     * 
     */
    @InputImport(name="filterValue")
      private final @Nullable Input<String> filterValue;

    public Input<String> getFilterValue() {
        return this.filterValue == null ? Input.empty() : this.filterValue;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectAudioTrackByAttribute'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public SelectAudioTrackByAttributeArgs(
        Input<Either<String,TrackAttribute>> attribute,
        @Nullable Input<Either<String,ChannelMapping>> channelMapping,
        Input<Either<String,AttributeFilter>> filter,
        @Nullable Input<String> filterValue,
        Input<String> odataType) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.channelMapping = channelMapping;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.filterValue = filterValue;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private SelectAudioTrackByAttributeArgs() {
        this.attribute = Input.empty();
        this.channelMapping = Input.empty();
        this.filter = Input.empty();
        this.filterValue = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectAudioTrackByAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,TrackAttribute>> attribute;
        private @Nullable Input<Either<String,ChannelMapping>> channelMapping;
        private Input<Either<String,AttributeFilter>> filter;
        private @Nullable Input<String> filterValue;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectAudioTrackByAttributeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.channelMapping = defaults.channelMapping;
    	      this.filter = defaults.filter;
    	      this.filterValue = defaults.filterValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAttribute(Input<Either<String,TrackAttribute>> attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder setAttribute(Either<String,TrackAttribute> attribute) {
            this.attribute = Input.of(Objects.requireNonNull(attribute));
            return this;
        }

        public Builder setChannelMapping(@Nullable Input<Either<String,ChannelMapping>> channelMapping) {
            this.channelMapping = channelMapping;
            return this;
        }

        public Builder setChannelMapping(@Nullable Either<String,ChannelMapping> channelMapping) {
            this.channelMapping = Input.ofNullable(channelMapping);
            return this;
        }

        public Builder setFilter(Input<Either<String,AttributeFilter>> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilter(Either<String,AttributeFilter> filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
            return this;
        }

        public Builder setFilterValue(@Nullable Input<String> filterValue) {
            this.filterValue = filterValue;
            return this;
        }

        public Builder setFilterValue(@Nullable String filterValue) {
            this.filterValue = Input.ofNullable(filterValue);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }
        public SelectAudioTrackByAttributeArgs build() {
            return new SelectAudioTrackByAttributeArgs(attribute, channelMapping, filter, filterValue, odataType);
        }
    }
}
