// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AbsoluteClipTimeResponse;
import io.pulumi.azurenative.media.inputs.FromAllInputFileResponse;
import io.pulumi.azurenative.media.inputs.FromEachInputFileResponse;
import io.pulumi.azurenative.media.inputs.InputFileResponse;
import io.pulumi.azurenative.media.inputs.UtcClipTimeResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents HTTPS job input.
 * 
 */
public final class JobInputHttpResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobInputHttpResponse Empty = new JobInputHttpResponse();

    /**
     * Base URI for HTTPS job input. It will be concatenated with provided file names. If no base uri is given, then the provided file list is assumed to be fully qualified uris. Maximum length of 4000 characters.
     * 
     */
    @Import(name="baseUri")
      private final @Nullable String baseUri;

    public Optional<String> getBaseUri() {
        return this.baseUri == null ? Optional.empty() : Optional.ofNullable(this.baseUri);
    }

    /**
     * Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     * 
     */
    @Import(name="end")
      private final @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end;

    public Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> getEnd() {
        return this.end == null ? null : this.end;
    }

    /**
     * List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     * 
     */
    @Import(name="files")
      private final @Nullable List<String> files;

    public List<String> getFiles() {
        return this.files == null ? List.of() : this.files;
    }

    /**
     * Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
     * 
     */
    @Import(name="inputDefinitions")
      private final @Nullable List<Object> inputDefinitions;

    public List<Object> getInputDefinitions() {
        return this.inputDefinitions == null ? List.of() : this.inputDefinitions;
    }

    /**
     * A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label 'xyz'.
     * 
     */
    @Import(name="label")
      private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobInputHttp'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     * 
     */
    @Import(name="start")
      private final @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start;

    public Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> getStart() {
        return this.start == null ? null : this.start;
    }

    public JobInputHttpResponse(
        @Nullable String baseUri,
        @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end,
        @Nullable List<String> files,
        @Nullable List<Object> inputDefinitions,
        @Nullable String label,
        String odataType,
        @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start) {
        this.baseUri = baseUri;
        this.end = end;
        this.files = files;
        this.inputDefinitions = inputDefinitions;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.start = start;
    }

    private JobInputHttpResponse() {
        this.baseUri = null;
        this.end = null;
        this.files = List.of();
        this.inputDefinitions = List.of();
        this.label = null;
        this.odataType = null;
        this.start = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobInputHttpResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String baseUri;
        private @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end;
        private @Nullable List<String> files;
        private @Nullable List<Object> inputDefinitions;
        private @Nullable String label;
        private String odataType;
        private @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start;

        public Builder() {
    	      // Empty
        }

        public Builder(JobInputHttpResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUri = defaults.baseUri;
    	      this.end = defaults.end;
    	      this.files = defaults.files;
    	      this.inputDefinitions = defaults.inputDefinitions;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.start = defaults.start;
        }

        public Builder baseUri(@Nullable String baseUri) {
            this.baseUri = baseUri;
            return this;
        }
        public Builder end(@Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end) {
            this.end = end;
            return this;
        }
        public Builder files(@Nullable List<String> files) {
            this.files = files;
            return this;
        }
        public Builder files(String... files) {
            return files(List.of(files));
        }
        public Builder inputDefinitions(@Nullable List<Object> inputDefinitions) {
            this.inputDefinitions = inputDefinitions;
            return this;
        }
        public Builder inputDefinitions(Object... inputDefinitions) {
            return inputDefinitions(List.of(inputDefinitions));
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder start(@Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start) {
            this.start = start;
            return this;
        }        public JobInputHttpResponse build() {
            return new JobInputHttpResponse(baseUri, end, files, inputDefinitions, label, odataType, start);
        }
    }
}
