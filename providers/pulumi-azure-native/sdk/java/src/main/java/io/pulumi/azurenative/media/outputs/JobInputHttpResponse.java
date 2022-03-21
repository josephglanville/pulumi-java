// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.AbsoluteClipTimeResponse;
import io.pulumi.azurenative.media.outputs.FromAllInputFileResponse;
import io.pulumi.azurenative.media.outputs.FromEachInputFileResponse;
import io.pulumi.azurenative.media.outputs.InputFileResponse;
import io.pulumi.azurenative.media.outputs.UtcClipTimeResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobInputHttpResponse {
    /**
     * Base URI for HTTPS job input. It will be concatenated with provided file names. If no base uri is given, then the provided file list is assumed to be fully qualified uris. Maximum length of 4000 characters.
     * 
     */
    private final @Nullable String baseUri;
    /**
     * Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     * 
     */
    private final @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end;
    /**
     * List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     * 
     */
    private final @Nullable List<String> files;
    /**
     * Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
     * 
     */
    private final @Nullable List<Object> inputDefinitions;
    /**
     * A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label 'xyz'.
     * 
     */
    private final @Nullable String label;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobInputHttp'.
     * 
     */
    private final String odataType;
    /**
     * Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     * 
     */
    private final @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start;

    @CustomType.Constructor
    private JobInputHttpResponse(
        @CustomType.Parameter("baseUri") @Nullable String baseUri,
        @CustomType.Parameter("end") @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> end,
        @CustomType.Parameter("files") @Nullable List<String> files,
        @CustomType.Parameter("inputDefinitions") @Nullable List<Object> inputDefinitions,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("start") @Nullable Either<AbsoluteClipTimeResponse,UtcClipTimeResponse> start) {
        this.baseUri = baseUri;
        this.end = end;
        this.files = files;
        this.inputDefinitions = inputDefinitions;
        this.label = label;
        this.odataType = odataType;
        this.start = start;
    }

    /**
     * Base URI for HTTPS job input. It will be concatenated with provided file names. If no base uri is given, then the provided file list is assumed to be fully qualified uris. Maximum length of 4000 characters.
     * 
    */
    public Optional<String> getBaseUri() {
        return Optional.ofNullable(this.baseUri);
    }
    /**
     * Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     * 
    */
    public Optional<Either<AbsoluteClipTimeResponse,UtcClipTimeResponse>> getEnd() {
        return Optional.ofNullable(this.end);
    }
    /**
     * List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     * 
    */
    public List<String> getFiles() {
        return this.files == null ? List.of() : this.files;
    }
    /**
     * Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
     * 
    */
    public List<Object> getInputDefinitions() {
        return this.inputDefinitions == null ? List.of() : this.inputDefinitions;
    }
    /**
     * A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label 'xyz'.
     * 
    */
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobInputHttp'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     * 
    */
    public Optional<Either<AbsoluteClipTimeResponse,UtcClipTimeResponse>> getStart() {
        return Optional.ofNullable(this.start);
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
