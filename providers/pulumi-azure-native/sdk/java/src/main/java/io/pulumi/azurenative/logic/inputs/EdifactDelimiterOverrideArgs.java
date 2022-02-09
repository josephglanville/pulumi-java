// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.EdifactDecimalIndicator;
import io.pulumi.azurenative.logic.enums.SegmentTerminatorSuffix;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdifactDelimiterOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdifactDelimiterOverrideArgs Empty = new EdifactDelimiterOverrideArgs();

    @InputImport(name="componentSeparator", required=true)
    private final Input<Integer> componentSeparator;

    public Input<Integer> getComponentSeparator() {
        return this.componentSeparator;
    }

    @InputImport(name="dataElementSeparator", required=true)
    private final Input<Integer> dataElementSeparator;

    public Input<Integer> getDataElementSeparator() {
        return this.dataElementSeparator;
    }

    @InputImport(name="decimalPointIndicator", required=true)
    private final Input<EdifactDecimalIndicator> decimalPointIndicator;

    public Input<EdifactDecimalIndicator> getDecimalPointIndicator() {
        return this.decimalPointIndicator;
    }

    @InputImport(name="messageAssociationAssignedCode")
    private final @Nullable Input<String> messageAssociationAssignedCode;

    public Input<String> getMessageAssociationAssignedCode() {
        return this.messageAssociationAssignedCode == null ? Input.empty() : this.messageAssociationAssignedCode;
    }

    @InputImport(name="messageId")
    private final @Nullable Input<String> messageId;

    public Input<String> getMessageId() {
        return this.messageId == null ? Input.empty() : this.messageId;
    }

    @InputImport(name="messageRelease")
    private final @Nullable Input<String> messageRelease;

    public Input<String> getMessageRelease() {
        return this.messageRelease == null ? Input.empty() : this.messageRelease;
    }

    @InputImport(name="messageVersion")
    private final @Nullable Input<String> messageVersion;

    public Input<String> getMessageVersion() {
        return this.messageVersion == null ? Input.empty() : this.messageVersion;
    }

    @InputImport(name="releaseIndicator", required=true)
    private final Input<Integer> releaseIndicator;

    public Input<Integer> getReleaseIndicator() {
        return this.releaseIndicator;
    }

    @InputImport(name="repetitionSeparator", required=true)
    private final Input<Integer> repetitionSeparator;

    public Input<Integer> getRepetitionSeparator() {
        return this.repetitionSeparator;
    }

    @InputImport(name="segmentTerminator", required=true)
    private final Input<Integer> segmentTerminator;

    public Input<Integer> getSegmentTerminator() {
        return this.segmentTerminator;
    }

    @InputImport(name="segmentTerminatorSuffix", required=true)
    private final Input<SegmentTerminatorSuffix> segmentTerminatorSuffix;

    public Input<SegmentTerminatorSuffix> getSegmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    @InputImport(name="targetNamespace")
    private final @Nullable Input<String> targetNamespace;

    public Input<String> getTargetNamespace() {
        return this.targetNamespace == null ? Input.empty() : this.targetNamespace;
    }

    public EdifactDelimiterOverrideArgs(
        Input<Integer> componentSeparator,
        Input<Integer> dataElementSeparator,
        Input<EdifactDecimalIndicator> decimalPointIndicator,
        @Nullable Input<String> messageAssociationAssignedCode,
        @Nullable Input<String> messageId,
        @Nullable Input<String> messageRelease,
        @Nullable Input<String> messageVersion,
        Input<Integer> releaseIndicator,
        Input<Integer> repetitionSeparator,
        Input<Integer> segmentTerminator,
        Input<SegmentTerminatorSuffix> segmentTerminatorSuffix,
        @Nullable Input<String> targetNamespace) {
        this.componentSeparator = Objects.requireNonNull(componentSeparator, "expected parameter 'componentSeparator' to be non-null");
        this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
        this.decimalPointIndicator = Objects.requireNonNull(decimalPointIndicator, "expected parameter 'decimalPointIndicator' to be non-null");
        this.messageAssociationAssignedCode = messageAssociationAssignedCode;
        this.messageId = messageId;
        this.messageRelease = messageRelease;
        this.messageVersion = messageVersion;
        this.releaseIndicator = Objects.requireNonNull(releaseIndicator, "expected parameter 'releaseIndicator' to be non-null");
        this.repetitionSeparator = Objects.requireNonNull(repetitionSeparator, "expected parameter 'repetitionSeparator' to be non-null");
        this.segmentTerminator = Objects.requireNonNull(segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
        this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
        this.targetNamespace = targetNamespace;
    }

    private EdifactDelimiterOverrideArgs() {
        this.componentSeparator = Input.empty();
        this.dataElementSeparator = Input.empty();
        this.decimalPointIndicator = Input.empty();
        this.messageAssociationAssignedCode = Input.empty();
        this.messageId = Input.empty();
        this.messageRelease = Input.empty();
        this.messageVersion = Input.empty();
        this.releaseIndicator = Input.empty();
        this.repetitionSeparator = Input.empty();
        this.segmentTerminator = Input.empty();
        this.segmentTerminatorSuffix = Input.empty();
        this.targetNamespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactDelimiterOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> componentSeparator;
        private Input<Integer> dataElementSeparator;
        private Input<EdifactDecimalIndicator> decimalPointIndicator;
        private @Nullable Input<String> messageAssociationAssignedCode;
        private @Nullable Input<String> messageId;
        private @Nullable Input<String> messageRelease;
        private @Nullable Input<String> messageVersion;
        private Input<Integer> releaseIndicator;
        private Input<Integer> repetitionSeparator;
        private Input<Integer> segmentTerminator;
        private Input<SegmentTerminatorSuffix> segmentTerminatorSuffix;
        private @Nullable Input<String> targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactDelimiterOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentSeparator = defaults.componentSeparator;
    	      this.dataElementSeparator = defaults.dataElementSeparator;
    	      this.decimalPointIndicator = defaults.decimalPointIndicator;
    	      this.messageAssociationAssignedCode = defaults.messageAssociationAssignedCode;
    	      this.messageId = defaults.messageId;
    	      this.messageRelease = defaults.messageRelease;
    	      this.messageVersion = defaults.messageVersion;
    	      this.releaseIndicator = defaults.releaseIndicator;
    	      this.repetitionSeparator = defaults.repetitionSeparator;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.segmentTerminatorSuffix = defaults.segmentTerminatorSuffix;
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder setComponentSeparator(Input<Integer> componentSeparator) {
            this.componentSeparator = Objects.requireNonNull(componentSeparator);
            return this;
        }

        public Builder setComponentSeparator(Integer componentSeparator) {
            this.componentSeparator = Input.of(Objects.requireNonNull(componentSeparator));
            return this;
        }

        public Builder setDataElementSeparator(Input<Integer> dataElementSeparator) {
            this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator);
            return this;
        }

        public Builder setDataElementSeparator(Integer dataElementSeparator) {
            this.dataElementSeparator = Input.of(Objects.requireNonNull(dataElementSeparator));
            return this;
        }

        public Builder setDecimalPointIndicator(Input<EdifactDecimalIndicator> decimalPointIndicator) {
            this.decimalPointIndicator = Objects.requireNonNull(decimalPointIndicator);
            return this;
        }

        public Builder setDecimalPointIndicator(EdifactDecimalIndicator decimalPointIndicator) {
            this.decimalPointIndicator = Input.of(Objects.requireNonNull(decimalPointIndicator));
            return this;
        }

        public Builder setMessageAssociationAssignedCode(@Nullable Input<String> messageAssociationAssignedCode) {
            this.messageAssociationAssignedCode = messageAssociationAssignedCode;
            return this;
        }

        public Builder setMessageAssociationAssignedCode(@Nullable String messageAssociationAssignedCode) {
            this.messageAssociationAssignedCode = Input.ofNullable(messageAssociationAssignedCode);
            return this;
        }

        public Builder setMessageId(@Nullable Input<String> messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setMessageId(@Nullable String messageId) {
            this.messageId = Input.ofNullable(messageId);
            return this;
        }

        public Builder setMessageRelease(@Nullable Input<String> messageRelease) {
            this.messageRelease = messageRelease;
            return this;
        }

        public Builder setMessageRelease(@Nullable String messageRelease) {
            this.messageRelease = Input.ofNullable(messageRelease);
            return this;
        }

        public Builder setMessageVersion(@Nullable Input<String> messageVersion) {
            this.messageVersion = messageVersion;
            return this;
        }

        public Builder setMessageVersion(@Nullable String messageVersion) {
            this.messageVersion = Input.ofNullable(messageVersion);
            return this;
        }

        public Builder setReleaseIndicator(Input<Integer> releaseIndicator) {
            this.releaseIndicator = Objects.requireNonNull(releaseIndicator);
            return this;
        }

        public Builder setReleaseIndicator(Integer releaseIndicator) {
            this.releaseIndicator = Input.of(Objects.requireNonNull(releaseIndicator));
            return this;
        }

        public Builder setRepetitionSeparator(Input<Integer> repetitionSeparator) {
            this.repetitionSeparator = Objects.requireNonNull(repetitionSeparator);
            return this;
        }

        public Builder setRepetitionSeparator(Integer repetitionSeparator) {
            this.repetitionSeparator = Input.of(Objects.requireNonNull(repetitionSeparator));
            return this;
        }

        public Builder setSegmentTerminator(Input<Integer> segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }

        public Builder setSegmentTerminator(Integer segmentTerminator) {
            this.segmentTerminator = Input.of(Objects.requireNonNull(segmentTerminator));
            return this;
        }

        public Builder setSegmentTerminatorSuffix(Input<SegmentTerminatorSuffix> segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix);
            return this;
        }

        public Builder setSegmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Input.of(Objects.requireNonNull(segmentTerminatorSuffix));
            return this;
        }

        public Builder setTargetNamespace(@Nullable Input<String> targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }

        public Builder setTargetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = Input.ofNullable(targetNamespace);
            return this;
        }

        public EdifactDelimiterOverrideArgs build() {
            return new EdifactDelimiterOverrideArgs(componentSeparator, dataElementSeparator, decimalPointIndicator, messageAssociationAssignedCode, messageId, messageRelease, messageVersion, releaseIndicator, repetitionSeparator, segmentTerminator, segmentTerminatorSuffix, targetNamespace);
        }
    }
}
