// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AbsoluteClipTimeArgs;
import io.pulumi.azurenative.media.inputs.FromAllInputFileArgs;
import io.pulumi.azurenative.media.inputs.FromEachInputFileArgs;
import io.pulumi.azurenative.media.inputs.InputFileArgs;
import io.pulumi.azurenative.media.inputs.UtcClipTimeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobInputHttpArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobInputHttpArgs Empty = new JobInputHttpArgs();

    @InputImport(name="baseUri")
    private final @Nullable Input<String> baseUri;

    public Input<String> getBaseUri() {
        return this.baseUri == null ? Input.empty() : this.baseUri;
    }

    @InputImport(name="end")
    private final @Nullable Input<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> end;

    public Input<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> getEnd() {
        return this.end == null ? Input.empty() : this.end;
    }

    @InputImport(name="files")
    private final @Nullable Input<List<String>> files;

    public Input<List<String>> getFiles() {
        return this.files == null ? Input.empty() : this.files;
    }

    @InputImport(name="inputDefinitions")
    private final @Nullable Input<List<Object>> inputDefinitions;

    public Input<List<Object>> getInputDefinitions() {
        return this.inputDefinitions == null ? Input.empty() : this.inputDefinitions;
    }

    @InputImport(name="label")
    private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    @InputImport(name="start")
    private final @Nullable Input<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> start;

    public Input<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> getStart() {
        return this.start == null ? Input.empty() : this.start;
    }

    public JobInputHttpArgs(
        @Nullable Input<String> baseUri,
        @Nullable Input<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> end,
        @Nullable Input<List<String>> files,
        @Nullable Input<List<Object>> inputDefinitions,
        @Nullable Input<String> label,
        Input<String> odataType,
        @Nullable Input<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> start) {
        this.baseUri = baseUri;
        this.end = end;
        this.files = files;
        this.inputDefinitions = inputDefinitions;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.start = start;
    }

    private JobInputHttpArgs() {
        this.baseUri = Input.empty();
        this.end = Input.empty();
        this.files = Input.empty();
        this.inputDefinitions = Input.empty();
        this.label = Input.empty();
        this.odataType = Input.empty();
        this.start = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobInputHttpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> baseUri;
        private @Nullable Input<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> end;
        private @Nullable Input<List<String>> files;
        private @Nullable Input<List<Object>> inputDefinitions;
        private @Nullable Input<String> label;
        private Input<String> odataType;
        private @Nullable Input<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> start;

        public Builder() {
    	      // Empty
        }

        public Builder(JobInputHttpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUri = defaults.baseUri;
    	      this.end = defaults.end;
    	      this.files = defaults.files;
    	      this.inputDefinitions = defaults.inputDefinitions;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.start = defaults.start;
        }

        public Builder setBaseUri(@Nullable Input<String> baseUri) {
            this.baseUri = baseUri;
            return this;
        }

        public Builder setBaseUri(@Nullable String baseUri) {
            this.baseUri = Input.ofNullable(baseUri);
            return this;
        }

        public Builder setEnd(@Nullable Input<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> end) {
            this.end = end;
            return this;
        }

        public Builder setEnd(@Nullable Either<AbsoluteClipTimeArgs,UtcClipTimeArgs> end) {
            this.end = Input.ofNullable(end);
            return this;
        }

        public Builder setFiles(@Nullable Input<List<String>> files) {
            this.files = files;
            return this;
        }

        public Builder setFiles(@Nullable List<String> files) {
            this.files = Input.ofNullable(files);
            return this;
        }

        public Builder setInputDefinitions(@Nullable Input<List<Object>> inputDefinitions) {
            this.inputDefinitions = inputDefinitions;
            return this;
        }

        public Builder setInputDefinitions(@Nullable List<Object> inputDefinitions) {
            this.inputDefinitions = Input.ofNullable(inputDefinitions);
            return this;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
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

        public Builder setStart(@Nullable Input<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> start) {
            this.start = start;
            return this;
        }

        public Builder setStart(@Nullable Either<AbsoluteClipTimeArgs,UtcClipTimeArgs> start) {
            this.start = Input.ofNullable(start);
            return this;
        }

        public JobInputHttpArgs build() {
            return new JobInputHttpArgs(baseUri, end, files, inputDefinitions, label, odataType, start);
        }
    }
}
