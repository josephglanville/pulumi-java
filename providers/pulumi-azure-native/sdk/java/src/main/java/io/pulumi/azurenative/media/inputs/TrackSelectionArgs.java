// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.TrackPropertyConditionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class to select a track
 * 
 */
public final class TrackSelectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrackSelectionArgs Empty = new TrackSelectionArgs();

    /**
     * TrackSelections is a track property condition list which can specify track(s)
     * 
     */
    @InputImport(name="trackSelections")
      private final @Nullable Input<List<TrackPropertyConditionArgs>> trackSelections;

    public Input<List<TrackPropertyConditionArgs>> getTrackSelections() {
        return this.trackSelections == null ? Input.empty() : this.trackSelections;
    }

    public TrackSelectionArgs(@Nullable Input<List<TrackPropertyConditionArgs>> trackSelections) {
        this.trackSelections = trackSelections;
    }

    private TrackSelectionArgs() {
        this.trackSelections = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrackSelectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<TrackPropertyConditionArgs>> trackSelections;

        public Builder() {
    	      // Empty
        }

        public Builder(TrackSelectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trackSelections = defaults.trackSelections;
        }

        public Builder setTrackSelections(@Nullable Input<List<TrackPropertyConditionArgs>> trackSelections) {
            this.trackSelections = trackSelections;
            return this;
        }

        public Builder setTrackSelections(@Nullable List<TrackPropertyConditionArgs> trackSelections) {
            this.trackSelections = Input.ofNullable(trackSelections);
            return this;
        }
        public TrackSelectionArgs build() {
            return new TrackSelectionArgs(trackSelections);
        }
    }
}
