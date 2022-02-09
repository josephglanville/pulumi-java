// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.azurenative.testbase.outputs.PackageValidationResultResponse;
import io.pulumi.azurenative.testbase.outputs.SystemDataResponse;
import io.pulumi.azurenative.testbase.outputs.TargetOSInfoResponse;
import io.pulumi.azurenative.testbase.outputs.TestResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPackageResult {
    private final String applicationName;
    private final String blobPath;
    private final String etag;
    private final String flightingRing;
    private final String id;
    private final Boolean isEnabled;
    private final String lastModifiedTime;
    private final String location;
    private final String name;
    private final String packageStatus;
    private final String provisioningState;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final List<TargetOSInfoResponse> targetOSList;
    private final List<String> testTypes;
    private final List<TestResponse> tests;
    private final String type;
    private final List<PackageValidationResultResponse> validationResults;
    private final String version;

    @OutputCustomType.Constructor({"applicationName","blobPath","etag","flightingRing","id","isEnabled","lastModifiedTime","location","name","packageStatus","provisioningState","systemData","tags","targetOSList","testTypes","tests","type","validationResults","version"})
    private GetPackageResult(
        String applicationName,
        String blobPath,
        String etag,
        String flightingRing,
        String id,
        Boolean isEnabled,
        String lastModifiedTime,
        String location,
        String name,
        String packageStatus,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        List<TargetOSInfoResponse> targetOSList,
        List<String> testTypes,
        List<TestResponse> tests,
        String type,
        List<PackageValidationResultResponse> validationResults,
        String version) {
        this.applicationName = Objects.requireNonNull(applicationName);
        this.blobPath = Objects.requireNonNull(blobPath);
        this.etag = Objects.requireNonNull(etag);
        this.flightingRing = Objects.requireNonNull(flightingRing);
        this.id = Objects.requireNonNull(id);
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.packageStatus = Objects.requireNonNull(packageStatus);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.targetOSList = Objects.requireNonNull(targetOSList);
        this.testTypes = Objects.requireNonNull(testTypes);
        this.tests = Objects.requireNonNull(tests);
        this.type = Objects.requireNonNull(type);
        this.validationResults = Objects.requireNonNull(validationResults);
        this.version = Objects.requireNonNull(version);
    }

    public String getApplicationName() {
        return this.applicationName;
    }
    public String getBlobPath() {
        return this.blobPath;
    }
    public String getEtag() {
        return this.etag;
    }
    public String getFlightingRing() {
        return this.flightingRing;
    }
    public String getId() {
        return this.id;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public String getPackageStatus() {
        return this.packageStatus;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public List<TargetOSInfoResponse> getTargetOSList() {
        return this.targetOSList;
    }
    public List<String> getTestTypes() {
        return this.testTypes;
    }
    public List<TestResponse> getTests() {
        return this.tests;
    }
    public String getType() {
        return this.type;
    }
    public List<PackageValidationResultResponse> getValidationResults() {
        return this.validationResults;
    }
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPackageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationName;
        private String blobPath;
        private String etag;
        private String flightingRing;
        private String id;
        private Boolean isEnabled;
        private String lastModifiedTime;
        private String location;
        private String name;
        private String packageStatus;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private List<TargetOSInfoResponse> targetOSList;
        private List<String> testTypes;
        private List<TestResponse> tests;
        private String type;
        private List<PackageValidationResultResponse> validationResults;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPackageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.blobPath = defaults.blobPath;
    	      this.etag = defaults.etag;
    	      this.flightingRing = defaults.flightingRing;
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.packageStatus = defaults.packageStatus;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.targetOSList = defaults.targetOSList;
    	      this.testTypes = defaults.testTypes;
    	      this.tests = defaults.tests;
    	      this.type = defaults.type;
    	      this.validationResults = defaults.validationResults;
    	      this.version = defaults.version;
        }

        public Builder setApplicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }

        public Builder setBlobPath(String blobPath) {
            this.blobPath = Objects.requireNonNull(blobPath);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFlightingRing(String flightingRing) {
            this.flightingRing = Objects.requireNonNull(flightingRing);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPackageStatus(String packageStatus) {
            this.packageStatus = Objects.requireNonNull(packageStatus);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetOSList(List<TargetOSInfoResponse> targetOSList) {
            this.targetOSList = Objects.requireNonNull(targetOSList);
            return this;
        }

        public Builder setTestTypes(List<String> testTypes) {
            this.testTypes = Objects.requireNonNull(testTypes);
            return this;
        }

        public Builder setTests(List<TestResponse> tests) {
            this.tests = Objects.requireNonNull(tests);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValidationResults(List<PackageValidationResultResponse> validationResults) {
            this.validationResults = Objects.requireNonNull(validationResults);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public GetPackageResult build() {
            return new GetPackageResult(applicationName, blobPath, etag, flightingRing, id, isEnabled, lastModifiedTime, location, name, packageStatus, provisioningState, systemData, tags, targetOSList, testTypes, tests, type, validationResults, version);
        }
    }
}
