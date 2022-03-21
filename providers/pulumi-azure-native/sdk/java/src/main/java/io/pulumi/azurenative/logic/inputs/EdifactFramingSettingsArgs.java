// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.EdifactCharacterSet;
import io.pulumi.azurenative.logic.enums.EdifactDecimalIndicator;
import io.pulumi.azurenative.logic.enums.SegmentTerminatorSuffix;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Edifact agreement framing settings.
 * 
 */
public final class EdifactFramingSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdifactFramingSettingsArgs Empty = new EdifactFramingSettingsArgs();

    /**
     * The character encoding.
     * 
     */
    @Import(name="characterEncoding")
      private final @Nullable Output<String> characterEncoding;

    public Output<String> getCharacterEncoding() {
        return this.characterEncoding == null ? Output.empty() : this.characterEncoding;
    }

    /**
     * The EDIFACT frame setting characterSet.
     * 
     */
    @Import(name="characterSet", required=true)
      private final Output<Either<String,EdifactCharacterSet>> characterSet;

    public Output<Either<String,EdifactCharacterSet>> getCharacterSet() {
        return this.characterSet;
    }

    /**
     * The component separator.
     * 
     */
    @Import(name="componentSeparator", required=true)
      private final Output<Integer> componentSeparator;

    public Output<Integer> getComponentSeparator() {
        return this.componentSeparator;
    }

    /**
     * The data element separator.
     * 
     */
    @Import(name="dataElementSeparator", required=true)
      private final Output<Integer> dataElementSeparator;

    public Output<Integer> getDataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * The EDIFACT frame setting decimal indicator.
     * 
     */
    @Import(name="decimalPointIndicator", required=true)
      private final Output<EdifactDecimalIndicator> decimalPointIndicator;

    public Output<EdifactDecimalIndicator> getDecimalPointIndicator() {
        return this.decimalPointIndicator;
    }

    /**
     * The protocol version.
     * 
     */
    @Import(name="protocolVersion", required=true)
      private final Output<Integer> protocolVersion;

    public Output<Integer> getProtocolVersion() {
        return this.protocolVersion;
    }

    /**
     * The release indicator.
     * 
     */
    @Import(name="releaseIndicator", required=true)
      private final Output<Integer> releaseIndicator;

    public Output<Integer> getReleaseIndicator() {
        return this.releaseIndicator;
    }

    /**
     * The repetition separator.
     * 
     */
    @Import(name="repetitionSeparator", required=true)
      private final Output<Integer> repetitionSeparator;

    public Output<Integer> getRepetitionSeparator() {
        return this.repetitionSeparator;
    }

    /**
     * The segment terminator.
     * 
     */
    @Import(name="segmentTerminator", required=true)
      private final Output<Integer> segmentTerminator;

    public Output<Integer> getSegmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * The EDIFACT frame setting segment terminator suffix.
     * 
     */
    @Import(name="segmentTerminatorSuffix", required=true)
      private final Output<SegmentTerminatorSuffix> segmentTerminatorSuffix;

    public Output<SegmentTerminatorSuffix> getSegmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * The service code list directory version.
     * 
     */
    @Import(name="serviceCodeListDirectoryVersion")
      private final @Nullable Output<String> serviceCodeListDirectoryVersion;

    public Output<String> getServiceCodeListDirectoryVersion() {
        return this.serviceCodeListDirectoryVersion == null ? Output.empty() : this.serviceCodeListDirectoryVersion;
    }

    public EdifactFramingSettingsArgs(
        @Nullable Output<String> characterEncoding,
        Output<Either<String,EdifactCharacterSet>> characterSet,
        Output<Integer> componentSeparator,
        Output<Integer> dataElementSeparator,
        Output<EdifactDecimalIndicator> decimalPointIndicator,
        Output<Integer> protocolVersion,
        Output<Integer> releaseIndicator,
        Output<Integer> repetitionSeparator,
        Output<Integer> segmentTerminator,
        Output<SegmentTerminatorSuffix> segmentTerminatorSuffix,
        @Nullable Output<String> serviceCodeListDirectoryVersion) {
        this.characterEncoding = characterEncoding;
        this.characterSet = Objects.requireNonNull(characterSet, "expected parameter 'characterSet' to be non-null");
        this.componentSeparator = Objects.requireNonNull(componentSeparator, "expected parameter 'componentSeparator' to be non-null");
        this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
        this.decimalPointIndicator = Objects.requireNonNull(decimalPointIndicator, "expected parameter 'decimalPointIndicator' to be non-null");
        this.protocolVersion = Objects.requireNonNull(protocolVersion, "expected parameter 'protocolVersion' to be non-null");
        this.releaseIndicator = Objects.requireNonNull(releaseIndicator, "expected parameter 'releaseIndicator' to be non-null");
        this.repetitionSeparator = Objects.requireNonNull(repetitionSeparator, "expected parameter 'repetitionSeparator' to be non-null");
        this.segmentTerminator = Objects.requireNonNull(segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
        this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
        this.serviceCodeListDirectoryVersion = serviceCodeListDirectoryVersion;
    }

    private EdifactFramingSettingsArgs() {
        this.characterEncoding = Output.empty();
        this.characterSet = Output.empty();
        this.componentSeparator = Output.empty();
        this.dataElementSeparator = Output.empty();
        this.decimalPointIndicator = Output.empty();
        this.protocolVersion = Output.empty();
        this.releaseIndicator = Output.empty();
        this.repetitionSeparator = Output.empty();
        this.segmentTerminator = Output.empty();
        this.segmentTerminatorSuffix = Output.empty();
        this.serviceCodeListDirectoryVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactFramingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> characterEncoding;
        private Output<Either<String,EdifactCharacterSet>> characterSet;
        private Output<Integer> componentSeparator;
        private Output<Integer> dataElementSeparator;
        private Output<EdifactDecimalIndicator> decimalPointIndicator;
        private Output<Integer> protocolVersion;
        private Output<Integer> releaseIndicator;
        private Output<Integer> repetitionSeparator;
        private Output<Integer> segmentTerminator;
        private Output<SegmentTerminatorSuffix> segmentTerminatorSuffix;
        private @Nullable Output<String> serviceCodeListDirectoryVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactFramingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characterEncoding = defaults.characterEncoding;
    	      this.characterSet = defaults.characterSet;
    	      this.componentSeparator = defaults.componentSeparator;
    	      this.dataElementSeparator = defaults.dataElementSeparator;
    	      this.decimalPointIndicator = defaults.decimalPointIndicator;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.releaseIndicator = defaults.releaseIndicator;
    	      this.repetitionSeparator = defaults.repetitionSeparator;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.segmentTerminatorSuffix = defaults.segmentTerminatorSuffix;
    	      this.serviceCodeListDirectoryVersion = defaults.serviceCodeListDirectoryVersion;
        }

        public Builder characterEncoding(@Nullable Output<String> characterEncoding) {
            this.characterEncoding = characterEncoding;
            return this;
        }
        public Builder characterEncoding(@Nullable String characterEncoding) {
            this.characterEncoding = Output.ofNullable(characterEncoding);
            return this;
        }
        public Builder characterSet(Output<Either<String,EdifactCharacterSet>> characterSet) {
            this.characterSet = Objects.requireNonNull(characterSet);
            return this;
        }
        public Builder characterSet(Either<String,EdifactCharacterSet> characterSet) {
            this.characterSet = Output.of(Objects.requireNonNull(characterSet));
            return this;
        }
        public Builder componentSeparator(Output<Integer> componentSeparator) {
            this.componentSeparator = Objects.requireNonNull(componentSeparator);
            return this;
        }
        public Builder componentSeparator(Integer componentSeparator) {
            this.componentSeparator = Output.of(Objects.requireNonNull(componentSeparator));
            return this;
        }
        public Builder dataElementSeparator(Output<Integer> dataElementSeparator) {
            this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator);
            return this;
        }
        public Builder dataElementSeparator(Integer dataElementSeparator) {
            this.dataElementSeparator = Output.of(Objects.requireNonNull(dataElementSeparator));
            return this;
        }
        public Builder decimalPointIndicator(Output<EdifactDecimalIndicator> decimalPointIndicator) {
            this.decimalPointIndicator = Objects.requireNonNull(decimalPointIndicator);
            return this;
        }
        public Builder decimalPointIndicator(EdifactDecimalIndicator decimalPointIndicator) {
            this.decimalPointIndicator = Output.of(Objects.requireNonNull(decimalPointIndicator));
            return this;
        }
        public Builder protocolVersion(Output<Integer> protocolVersion) {
            this.protocolVersion = Objects.requireNonNull(protocolVersion);
            return this;
        }
        public Builder protocolVersion(Integer protocolVersion) {
            this.protocolVersion = Output.of(Objects.requireNonNull(protocolVersion));
            return this;
        }
        public Builder releaseIndicator(Output<Integer> releaseIndicator) {
            this.releaseIndicator = Objects.requireNonNull(releaseIndicator);
            return this;
        }
        public Builder releaseIndicator(Integer releaseIndicator) {
            this.releaseIndicator = Output.of(Objects.requireNonNull(releaseIndicator));
            return this;
        }
        public Builder repetitionSeparator(Output<Integer> repetitionSeparator) {
            this.repetitionSeparator = Objects.requireNonNull(repetitionSeparator);
            return this;
        }
        public Builder repetitionSeparator(Integer repetitionSeparator) {
            this.repetitionSeparator = Output.of(Objects.requireNonNull(repetitionSeparator));
            return this;
        }
        public Builder segmentTerminator(Output<Integer> segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }
        public Builder segmentTerminator(Integer segmentTerminator) {
            this.segmentTerminator = Output.of(Objects.requireNonNull(segmentTerminator));
            return this;
        }
        public Builder segmentTerminatorSuffix(Output<SegmentTerminatorSuffix> segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix);
            return this;
        }
        public Builder segmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Output.of(Objects.requireNonNull(segmentTerminatorSuffix));
            return this;
        }
        public Builder serviceCodeListDirectoryVersion(@Nullable Output<String> serviceCodeListDirectoryVersion) {
            this.serviceCodeListDirectoryVersion = serviceCodeListDirectoryVersion;
            return this;
        }
        public Builder serviceCodeListDirectoryVersion(@Nullable String serviceCodeListDirectoryVersion) {
            this.serviceCodeListDirectoryVersion = Output.ofNullable(serviceCodeListDirectoryVersion);
            return this;
        }        public EdifactFramingSettingsArgs build() {
            return new EdifactFramingSettingsArgs(characterEncoding, characterSet, componentSeparator, dataElementSeparator, decimalPointIndicator, protocolVersion, releaseIndicator, repetitionSeparator, segmentTerminator, segmentTerminatorSuffix, serviceCodeListDirectoryVersion);
        }
    }
}
