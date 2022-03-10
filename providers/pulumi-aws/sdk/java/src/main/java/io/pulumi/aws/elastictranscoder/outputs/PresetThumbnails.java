// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PresetThumbnails {
    /**
     * The aspect ratio of thumbnails. The following values are valid: auto, 1:1, 4:3, 3:2, 16:9
     * 
     */
    private final @Nullable String aspectRatio;
    /**
     * The format of thumbnails, if any. Valid formats are jpg and png.
     * 
     */
    private final @Nullable String format;
    /**
     * The approximate number of seconds between thumbnails. The value must be an integer. The actual interval can vary by several seconds from one thumbnail to the next.
     * 
     */
    private final @Nullable String interval;
    /**
     * The maximum height of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
     * 
     */
    private final @Nullable String maxHeight;
    /**
     * The maximum width of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
     * 
     */
    private final @Nullable String maxWidth;
    /**
     * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
     * 
     */
    private final @Nullable String paddingPolicy;
    /**
     * The width and height of thumbnail files in pixels, in the format WidthxHeight, where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object. (To better control resolution and aspect ratio of thumbnails, we recommend that you use the thumbnail values `max_width`, `max_height`, `sizing_policy`, and `padding_policy` instead of `resolution` and `aspect_ratio`. The two groups of settings are mutually exclusive. Do not use them together)
     * 
     */
    private final @Nullable String resolution;
    /**
     * A value that controls scaling of thumbnails. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, and `ShrinkToFill`.
     * 
     */
    private final @Nullable String sizingPolicy;

    @OutputCustomType.Constructor
    private PresetThumbnails(
        @OutputCustomType.Parameter("aspectRatio") @Nullable String aspectRatio,
        @OutputCustomType.Parameter("format") @Nullable String format,
        @OutputCustomType.Parameter("interval") @Nullable String interval,
        @OutputCustomType.Parameter("maxHeight") @Nullable String maxHeight,
        @OutputCustomType.Parameter("maxWidth") @Nullable String maxWidth,
        @OutputCustomType.Parameter("paddingPolicy") @Nullable String paddingPolicy,
        @OutputCustomType.Parameter("resolution") @Nullable String resolution,
        @OutputCustomType.Parameter("sizingPolicy") @Nullable String sizingPolicy) {
        this.aspectRatio = aspectRatio;
        this.format = format;
        this.interval = interval;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.paddingPolicy = paddingPolicy;
        this.resolution = resolution;
        this.sizingPolicy = sizingPolicy;
    }

    /**
     * The aspect ratio of thumbnails. The following values are valid: auto, 1:1, 4:3, 3:2, 16:9
     * 
    */
    public Optional<String> getAspectRatio() {
        return Optional.ofNullable(this.aspectRatio);
    }
    /**
     * The format of thumbnails, if any. Valid formats are jpg and png.
     * 
    */
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * The approximate number of seconds between thumbnails. The value must be an integer. The actual interval can vary by several seconds from one thumbnail to the next.
     * 
    */
    public Optional<String> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * The maximum height of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
     * 
    */
    public Optional<String> getMaxHeight() {
        return Optional.ofNullable(this.maxHeight);
    }
    /**
     * The maximum width of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
     * 
    */
    public Optional<String> getMaxWidth() {
        return Optional.ofNullable(this.maxWidth);
    }
    /**
     * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
     * 
    */
    public Optional<String> getPaddingPolicy() {
        return Optional.ofNullable(this.paddingPolicy);
    }
    /**
     * The width and height of thumbnail files in pixels, in the format WidthxHeight, where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object. (To better control resolution and aspect ratio of thumbnails, we recommend that you use the thumbnail values `max_width`, `max_height`, `sizing_policy`, and `padding_policy` instead of `resolution` and `aspect_ratio`. The two groups of settings are mutually exclusive. Do not use them together)
     * 
    */
    public Optional<String> getResolution() {
        return Optional.ofNullable(this.resolution);
    }
    /**
     * A value that controls scaling of thumbnails. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, and `ShrinkToFill`.
     * 
    */
    public Optional<String> getSizingPolicy() {
        return Optional.ofNullable(this.sizingPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresetThumbnails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aspectRatio;
        private @Nullable String format;
        private @Nullable String interval;
        private @Nullable String maxHeight;
        private @Nullable String maxWidth;
        private @Nullable String paddingPolicy;
        private @Nullable String resolution;
        private @Nullable String sizingPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(PresetThumbnails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aspectRatio = defaults.aspectRatio;
    	      this.format = defaults.format;
    	      this.interval = defaults.interval;
    	      this.maxHeight = defaults.maxHeight;
    	      this.maxWidth = defaults.maxWidth;
    	      this.paddingPolicy = defaults.paddingPolicy;
    	      this.resolution = defaults.resolution;
    	      this.sizingPolicy = defaults.sizingPolicy;
        }

        public Builder setAspectRatio(@Nullable String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setInterval(@Nullable String interval) {
            this.interval = interval;
            return this;
        }

        public Builder setMaxHeight(@Nullable String maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public Builder setMaxWidth(@Nullable String maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }

        public Builder setPaddingPolicy(@Nullable String paddingPolicy) {
            this.paddingPolicy = paddingPolicy;
            return this;
        }

        public Builder setResolution(@Nullable String resolution) {
            this.resolution = resolution;
            return this;
        }

        public Builder setSizingPolicy(@Nullable String sizingPolicy) {
            this.sizingPolicy = sizingPolicy;
            return this;
        }
        public PresetThumbnails build() {
            return new PresetThumbnails(aspectRatio, format, interval, maxHeight, maxWidth, paddingPolicy, resolution, sizingPolicy);
        }
    }
}
