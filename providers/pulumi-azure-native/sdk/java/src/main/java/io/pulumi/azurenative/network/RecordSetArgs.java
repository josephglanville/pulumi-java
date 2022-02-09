// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.ARecordArgs;
import io.pulumi.azurenative.network.inputs.AaaaRecordArgs;
import io.pulumi.azurenative.network.inputs.CaaRecordArgs;
import io.pulumi.azurenative.network.inputs.CnameRecordArgs;
import io.pulumi.azurenative.network.inputs.MxRecordArgs;
import io.pulumi.azurenative.network.inputs.NsRecordArgs;
import io.pulumi.azurenative.network.inputs.PtrRecordArgs;
import io.pulumi.azurenative.network.inputs.SoaRecordArgs;
import io.pulumi.azurenative.network.inputs.SrvRecordArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.TxtRecordArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecordSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecordSetArgs Empty = new RecordSetArgs();

    @InputImport(name="aRecords")
    private final @Nullable Input<List<ARecordArgs>> aRecords;

    public Input<List<ARecordArgs>> getARecords() {
        return this.aRecords == null ? Input.empty() : this.aRecords;
    }

    @InputImport(name="aaaaRecords")
    private final @Nullable Input<List<AaaaRecordArgs>> aaaaRecords;

    public Input<List<AaaaRecordArgs>> getAaaaRecords() {
        return this.aaaaRecords == null ? Input.empty() : this.aaaaRecords;
    }

    @InputImport(name="caaRecords")
    private final @Nullable Input<List<CaaRecordArgs>> caaRecords;

    public Input<List<CaaRecordArgs>> getCaaRecords() {
        return this.caaRecords == null ? Input.empty() : this.caaRecords;
    }

    @InputImport(name="cnameRecord")
    private final @Nullable Input<CnameRecordArgs> cnameRecord;

    public Input<CnameRecordArgs> getCnameRecord() {
        return this.cnameRecord == null ? Input.empty() : this.cnameRecord;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="mxRecords")
    private final @Nullable Input<List<MxRecordArgs>> mxRecords;

    public Input<List<MxRecordArgs>> getMxRecords() {
        return this.mxRecords == null ? Input.empty() : this.mxRecords;
    }

    @InputImport(name="nsRecords")
    private final @Nullable Input<List<NsRecordArgs>> nsRecords;

    public Input<List<NsRecordArgs>> getNsRecords() {
        return this.nsRecords == null ? Input.empty() : this.nsRecords;
    }

    @InputImport(name="ptrRecords")
    private final @Nullable Input<List<PtrRecordArgs>> ptrRecords;

    public Input<List<PtrRecordArgs>> getPtrRecords() {
        return this.ptrRecords == null ? Input.empty() : this.ptrRecords;
    }

    @InputImport(name="recordType", required=true)
    private final Input<String> recordType;

    public Input<String> getRecordType() {
        return this.recordType;
    }

    @InputImport(name="relativeRecordSetName")
    private final @Nullable Input<String> relativeRecordSetName;

    public Input<String> getRelativeRecordSetName() {
        return this.relativeRecordSetName == null ? Input.empty() : this.relativeRecordSetName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="soaRecord")
    private final @Nullable Input<SoaRecordArgs> soaRecord;

    public Input<SoaRecordArgs> getSoaRecord() {
        return this.soaRecord == null ? Input.empty() : this.soaRecord;
    }

    @InputImport(name="srvRecords")
    private final @Nullable Input<List<SrvRecordArgs>> srvRecords;

    public Input<List<SrvRecordArgs>> getSrvRecords() {
        return this.srvRecords == null ? Input.empty() : this.srvRecords;
    }

    @InputImport(name="targetResource")
    private final @Nullable Input<SubResourceArgs> targetResource;

    public Input<SubResourceArgs> getTargetResource() {
        return this.targetResource == null ? Input.empty() : this.targetResource;
    }

    @InputImport(name="ttl")
    private final @Nullable Input<Double> ttl;

    public Input<Double> getTtl() {
        return this.ttl == null ? Input.empty() : this.ttl;
    }

    @InputImport(name="txtRecords")
    private final @Nullable Input<List<TxtRecordArgs>> txtRecords;

    public Input<List<TxtRecordArgs>> getTxtRecords() {
        return this.txtRecords == null ? Input.empty() : this.txtRecords;
    }

    @InputImport(name="zoneName", required=true)
    private final Input<String> zoneName;

    public Input<String> getZoneName() {
        return this.zoneName;
    }

    public RecordSetArgs(
        @Nullable Input<List<ARecordArgs>> aRecords,
        @Nullable Input<List<AaaaRecordArgs>> aaaaRecords,
        @Nullable Input<List<CaaRecordArgs>> caaRecords,
        @Nullable Input<CnameRecordArgs> cnameRecord,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<List<MxRecordArgs>> mxRecords,
        @Nullable Input<List<NsRecordArgs>> nsRecords,
        @Nullable Input<List<PtrRecordArgs>> ptrRecords,
        Input<String> recordType,
        @Nullable Input<String> relativeRecordSetName,
        Input<String> resourceGroupName,
        @Nullable Input<SoaRecordArgs> soaRecord,
        @Nullable Input<List<SrvRecordArgs>> srvRecords,
        @Nullable Input<SubResourceArgs> targetResource,
        @Nullable Input<Double> ttl,
        @Nullable Input<List<TxtRecordArgs>> txtRecords,
        Input<String> zoneName) {
        this.aRecords = aRecords;
        this.aaaaRecords = aaaaRecords;
        this.caaRecords = caaRecords;
        this.cnameRecord = cnameRecord;
        this.metadata = metadata;
        this.mxRecords = mxRecords;
        this.nsRecords = nsRecords;
        this.ptrRecords = ptrRecords;
        this.recordType = Objects.requireNonNull(recordType, "expected parameter 'recordType' to be non-null");
        this.relativeRecordSetName = relativeRecordSetName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.soaRecord = soaRecord;
        this.srvRecords = srvRecords;
        this.targetResource = targetResource;
        this.ttl = ttl;
        this.txtRecords = txtRecords;
        this.zoneName = Objects.requireNonNull(zoneName, "expected parameter 'zoneName' to be non-null");
    }

    private RecordSetArgs() {
        this.aRecords = Input.empty();
        this.aaaaRecords = Input.empty();
        this.caaRecords = Input.empty();
        this.cnameRecord = Input.empty();
        this.metadata = Input.empty();
        this.mxRecords = Input.empty();
        this.nsRecords = Input.empty();
        this.ptrRecords = Input.empty();
        this.recordType = Input.empty();
        this.relativeRecordSetName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.soaRecord = Input.empty();
        this.srvRecords = Input.empty();
        this.targetResource = Input.empty();
        this.ttl = Input.empty();
        this.txtRecords = Input.empty();
        this.zoneName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ARecordArgs>> aRecords;
        private @Nullable Input<List<AaaaRecordArgs>> aaaaRecords;
        private @Nullable Input<List<CaaRecordArgs>> caaRecords;
        private @Nullable Input<CnameRecordArgs> cnameRecord;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<List<MxRecordArgs>> mxRecords;
        private @Nullable Input<List<NsRecordArgs>> nsRecords;
        private @Nullable Input<List<PtrRecordArgs>> ptrRecords;
        private Input<String> recordType;
        private @Nullable Input<String> relativeRecordSetName;
        private Input<String> resourceGroupName;
        private @Nullable Input<SoaRecordArgs> soaRecord;
        private @Nullable Input<List<SrvRecordArgs>> srvRecords;
        private @Nullable Input<SubResourceArgs> targetResource;
        private @Nullable Input<Double> ttl;
        private @Nullable Input<List<TxtRecordArgs>> txtRecords;
        private Input<String> zoneName;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aRecords = defaults.aRecords;
    	      this.aaaaRecords = defaults.aaaaRecords;
    	      this.caaRecords = defaults.caaRecords;
    	      this.cnameRecord = defaults.cnameRecord;
    	      this.metadata = defaults.metadata;
    	      this.mxRecords = defaults.mxRecords;
    	      this.nsRecords = defaults.nsRecords;
    	      this.ptrRecords = defaults.ptrRecords;
    	      this.recordType = defaults.recordType;
    	      this.relativeRecordSetName = defaults.relativeRecordSetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.soaRecord = defaults.soaRecord;
    	      this.srvRecords = defaults.srvRecords;
    	      this.targetResource = defaults.targetResource;
    	      this.ttl = defaults.ttl;
    	      this.txtRecords = defaults.txtRecords;
    	      this.zoneName = defaults.zoneName;
        }

        public Builder setARecords(@Nullable Input<List<ARecordArgs>> aRecords) {
            this.aRecords = aRecords;
            return this;
        }

        public Builder setARecords(@Nullable List<ARecordArgs> aRecords) {
            this.aRecords = Input.ofNullable(aRecords);
            return this;
        }

        public Builder setAaaaRecords(@Nullable Input<List<AaaaRecordArgs>> aaaaRecords) {
            this.aaaaRecords = aaaaRecords;
            return this;
        }

        public Builder setAaaaRecords(@Nullable List<AaaaRecordArgs> aaaaRecords) {
            this.aaaaRecords = Input.ofNullable(aaaaRecords);
            return this;
        }

        public Builder setCaaRecords(@Nullable Input<List<CaaRecordArgs>> caaRecords) {
            this.caaRecords = caaRecords;
            return this;
        }

        public Builder setCaaRecords(@Nullable List<CaaRecordArgs> caaRecords) {
            this.caaRecords = Input.ofNullable(caaRecords);
            return this;
        }

        public Builder setCnameRecord(@Nullable Input<CnameRecordArgs> cnameRecord) {
            this.cnameRecord = cnameRecord;
            return this;
        }

        public Builder setCnameRecord(@Nullable CnameRecordArgs cnameRecord) {
            this.cnameRecord = Input.ofNullable(cnameRecord);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setMxRecords(@Nullable Input<List<MxRecordArgs>> mxRecords) {
            this.mxRecords = mxRecords;
            return this;
        }

        public Builder setMxRecords(@Nullable List<MxRecordArgs> mxRecords) {
            this.mxRecords = Input.ofNullable(mxRecords);
            return this;
        }

        public Builder setNsRecords(@Nullable Input<List<NsRecordArgs>> nsRecords) {
            this.nsRecords = nsRecords;
            return this;
        }

        public Builder setNsRecords(@Nullable List<NsRecordArgs> nsRecords) {
            this.nsRecords = Input.ofNullable(nsRecords);
            return this;
        }

        public Builder setPtrRecords(@Nullable Input<List<PtrRecordArgs>> ptrRecords) {
            this.ptrRecords = ptrRecords;
            return this;
        }

        public Builder setPtrRecords(@Nullable List<PtrRecordArgs> ptrRecords) {
            this.ptrRecords = Input.ofNullable(ptrRecords);
            return this;
        }

        public Builder setRecordType(Input<String> recordType) {
            this.recordType = Objects.requireNonNull(recordType);
            return this;
        }

        public Builder setRecordType(String recordType) {
            this.recordType = Input.of(Objects.requireNonNull(recordType));
            return this;
        }

        public Builder setRelativeRecordSetName(@Nullable Input<String> relativeRecordSetName) {
            this.relativeRecordSetName = relativeRecordSetName;
            return this;
        }

        public Builder setRelativeRecordSetName(@Nullable String relativeRecordSetName) {
            this.relativeRecordSetName = Input.ofNullable(relativeRecordSetName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSoaRecord(@Nullable Input<SoaRecordArgs> soaRecord) {
            this.soaRecord = soaRecord;
            return this;
        }

        public Builder setSoaRecord(@Nullable SoaRecordArgs soaRecord) {
            this.soaRecord = Input.ofNullable(soaRecord);
            return this;
        }

        public Builder setSrvRecords(@Nullable Input<List<SrvRecordArgs>> srvRecords) {
            this.srvRecords = srvRecords;
            return this;
        }

        public Builder setSrvRecords(@Nullable List<SrvRecordArgs> srvRecords) {
            this.srvRecords = Input.ofNullable(srvRecords);
            return this;
        }

        public Builder setTargetResource(@Nullable Input<SubResourceArgs> targetResource) {
            this.targetResource = targetResource;
            return this;
        }

        public Builder setTargetResource(@Nullable SubResourceArgs targetResource) {
            this.targetResource = Input.ofNullable(targetResource);
            return this;
        }

        public Builder setTtl(@Nullable Input<Double> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setTtl(@Nullable Double ttl) {
            this.ttl = Input.ofNullable(ttl);
            return this;
        }

        public Builder setTxtRecords(@Nullable Input<List<TxtRecordArgs>> txtRecords) {
            this.txtRecords = txtRecords;
            return this;
        }

        public Builder setTxtRecords(@Nullable List<TxtRecordArgs> txtRecords) {
            this.txtRecords = Input.ofNullable(txtRecords);
            return this;
        }

        public Builder setZoneName(Input<String> zoneName) {
            this.zoneName = Objects.requireNonNull(zoneName);
            return this;
        }

        public Builder setZoneName(String zoneName) {
            this.zoneName = Input.of(Objects.requireNonNull(zoneName));
            return this;
        }

        public RecordSetArgs build() {
            return new RecordSetArgs(aRecords, aaaaRecords, caaRecords, cnameRecord, metadata, mxRecords, nsRecords, ptrRecords, recordType, relativeRecordSetName, resourceGroupName, soaRecord, srvRecords, targetResource, ttl, txtRecords, zoneName);
        }
    }
}
