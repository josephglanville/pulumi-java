// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceProfileLoRaWANServiceProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceProfileLoRaWANServiceProfileArgs Empty = new ServiceProfileLoRaWANServiceProfileArgs();

    @InputImport(name="addGwMetadata")
      private final @Nullable Input<Boolean> addGwMetadata;

    public Input<Boolean> getAddGwMetadata() {
        return this.addGwMetadata == null ? Input.empty() : this.addGwMetadata;
    }

    @InputImport(name="channelMask")
      private final @Nullable Input<String> channelMask;

    public Input<String> getChannelMask() {
        return this.channelMask == null ? Input.empty() : this.channelMask;
    }

    @InputImport(name="devStatusReqFreq")
      private final @Nullable Input<Integer> devStatusReqFreq;

    public Input<Integer> getDevStatusReqFreq() {
        return this.devStatusReqFreq == null ? Input.empty() : this.devStatusReqFreq;
    }

    @InputImport(name="dlBucketSize")
      private final @Nullable Input<Integer> dlBucketSize;

    public Input<Integer> getDlBucketSize() {
        return this.dlBucketSize == null ? Input.empty() : this.dlBucketSize;
    }

    @InputImport(name="dlRate")
      private final @Nullable Input<Integer> dlRate;

    public Input<Integer> getDlRate() {
        return this.dlRate == null ? Input.empty() : this.dlRate;
    }

    @InputImport(name="dlRatePolicy")
      private final @Nullable Input<String> dlRatePolicy;

    public Input<String> getDlRatePolicy() {
        return this.dlRatePolicy == null ? Input.empty() : this.dlRatePolicy;
    }

    @InputImport(name="drMax")
      private final @Nullable Input<Integer> drMax;

    public Input<Integer> getDrMax() {
        return this.drMax == null ? Input.empty() : this.drMax;
    }

    @InputImport(name="drMin")
      private final @Nullable Input<Integer> drMin;

    public Input<Integer> getDrMin() {
        return this.drMin == null ? Input.empty() : this.drMin;
    }

    @InputImport(name="hrAllowed")
      private final @Nullable Input<Boolean> hrAllowed;

    public Input<Boolean> getHrAllowed() {
        return this.hrAllowed == null ? Input.empty() : this.hrAllowed;
    }

    @InputImport(name="minGwDiversity")
      private final @Nullable Input<Integer> minGwDiversity;

    public Input<Integer> getMinGwDiversity() {
        return this.minGwDiversity == null ? Input.empty() : this.minGwDiversity;
    }

    @InputImport(name="nwkGeoLoc")
      private final @Nullable Input<Boolean> nwkGeoLoc;

    public Input<Boolean> getNwkGeoLoc() {
        return this.nwkGeoLoc == null ? Input.empty() : this.nwkGeoLoc;
    }

    @InputImport(name="prAllowed")
      private final @Nullable Input<Boolean> prAllowed;

    public Input<Boolean> getPrAllowed() {
        return this.prAllowed == null ? Input.empty() : this.prAllowed;
    }

    @InputImport(name="raAllowed")
      private final @Nullable Input<Boolean> raAllowed;

    public Input<Boolean> getRaAllowed() {
        return this.raAllowed == null ? Input.empty() : this.raAllowed;
    }

    @InputImport(name="reportDevStatusBattery")
      private final @Nullable Input<Boolean> reportDevStatusBattery;

    public Input<Boolean> getReportDevStatusBattery() {
        return this.reportDevStatusBattery == null ? Input.empty() : this.reportDevStatusBattery;
    }

    @InputImport(name="reportDevStatusMargin")
      private final @Nullable Input<Boolean> reportDevStatusMargin;

    public Input<Boolean> getReportDevStatusMargin() {
        return this.reportDevStatusMargin == null ? Input.empty() : this.reportDevStatusMargin;
    }

    @InputImport(name="targetPer")
      private final @Nullable Input<Integer> targetPer;

    public Input<Integer> getTargetPer() {
        return this.targetPer == null ? Input.empty() : this.targetPer;
    }

    @InputImport(name="ulBucketSize")
      private final @Nullable Input<Integer> ulBucketSize;

    public Input<Integer> getUlBucketSize() {
        return this.ulBucketSize == null ? Input.empty() : this.ulBucketSize;
    }

    @InputImport(name="ulRate")
      private final @Nullable Input<Integer> ulRate;

    public Input<Integer> getUlRate() {
        return this.ulRate == null ? Input.empty() : this.ulRate;
    }

    @InputImport(name="ulRatePolicy")
      private final @Nullable Input<String> ulRatePolicy;

    public Input<String> getUlRatePolicy() {
        return this.ulRatePolicy == null ? Input.empty() : this.ulRatePolicy;
    }

    public ServiceProfileLoRaWANServiceProfileArgs(
        @Nullable Input<Boolean> addGwMetadata,
        @Nullable Input<String> channelMask,
        @Nullable Input<Integer> devStatusReqFreq,
        @Nullable Input<Integer> dlBucketSize,
        @Nullable Input<Integer> dlRate,
        @Nullable Input<String> dlRatePolicy,
        @Nullable Input<Integer> drMax,
        @Nullable Input<Integer> drMin,
        @Nullable Input<Boolean> hrAllowed,
        @Nullable Input<Integer> minGwDiversity,
        @Nullable Input<Boolean> nwkGeoLoc,
        @Nullable Input<Boolean> prAllowed,
        @Nullable Input<Boolean> raAllowed,
        @Nullable Input<Boolean> reportDevStatusBattery,
        @Nullable Input<Boolean> reportDevStatusMargin,
        @Nullable Input<Integer> targetPer,
        @Nullable Input<Integer> ulBucketSize,
        @Nullable Input<Integer> ulRate,
        @Nullable Input<String> ulRatePolicy) {
        this.addGwMetadata = addGwMetadata;
        this.channelMask = channelMask;
        this.devStatusReqFreq = devStatusReqFreq;
        this.dlBucketSize = dlBucketSize;
        this.dlRate = dlRate;
        this.dlRatePolicy = dlRatePolicy;
        this.drMax = drMax;
        this.drMin = drMin;
        this.hrAllowed = hrAllowed;
        this.minGwDiversity = minGwDiversity;
        this.nwkGeoLoc = nwkGeoLoc;
        this.prAllowed = prAllowed;
        this.raAllowed = raAllowed;
        this.reportDevStatusBattery = reportDevStatusBattery;
        this.reportDevStatusMargin = reportDevStatusMargin;
        this.targetPer = targetPer;
        this.ulBucketSize = ulBucketSize;
        this.ulRate = ulRate;
        this.ulRatePolicy = ulRatePolicy;
    }

    private ServiceProfileLoRaWANServiceProfileArgs() {
        this.addGwMetadata = Input.empty();
        this.channelMask = Input.empty();
        this.devStatusReqFreq = Input.empty();
        this.dlBucketSize = Input.empty();
        this.dlRate = Input.empty();
        this.dlRatePolicy = Input.empty();
        this.drMax = Input.empty();
        this.drMin = Input.empty();
        this.hrAllowed = Input.empty();
        this.minGwDiversity = Input.empty();
        this.nwkGeoLoc = Input.empty();
        this.prAllowed = Input.empty();
        this.raAllowed = Input.empty();
        this.reportDevStatusBattery = Input.empty();
        this.reportDevStatusMargin = Input.empty();
        this.targetPer = Input.empty();
        this.ulBucketSize = Input.empty();
        this.ulRate = Input.empty();
        this.ulRatePolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProfileLoRaWANServiceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> addGwMetadata;
        private @Nullable Input<String> channelMask;
        private @Nullable Input<Integer> devStatusReqFreq;
        private @Nullable Input<Integer> dlBucketSize;
        private @Nullable Input<Integer> dlRate;
        private @Nullable Input<String> dlRatePolicy;
        private @Nullable Input<Integer> drMax;
        private @Nullable Input<Integer> drMin;
        private @Nullable Input<Boolean> hrAllowed;
        private @Nullable Input<Integer> minGwDiversity;
        private @Nullable Input<Boolean> nwkGeoLoc;
        private @Nullable Input<Boolean> prAllowed;
        private @Nullable Input<Boolean> raAllowed;
        private @Nullable Input<Boolean> reportDevStatusBattery;
        private @Nullable Input<Boolean> reportDevStatusMargin;
        private @Nullable Input<Integer> targetPer;
        private @Nullable Input<Integer> ulBucketSize;
        private @Nullable Input<Integer> ulRate;
        private @Nullable Input<String> ulRatePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceProfileLoRaWANServiceProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addGwMetadata = defaults.addGwMetadata;
    	      this.channelMask = defaults.channelMask;
    	      this.devStatusReqFreq = defaults.devStatusReqFreq;
    	      this.dlBucketSize = defaults.dlBucketSize;
    	      this.dlRate = defaults.dlRate;
    	      this.dlRatePolicy = defaults.dlRatePolicy;
    	      this.drMax = defaults.drMax;
    	      this.drMin = defaults.drMin;
    	      this.hrAllowed = defaults.hrAllowed;
    	      this.minGwDiversity = defaults.minGwDiversity;
    	      this.nwkGeoLoc = defaults.nwkGeoLoc;
    	      this.prAllowed = defaults.prAllowed;
    	      this.raAllowed = defaults.raAllowed;
    	      this.reportDevStatusBattery = defaults.reportDevStatusBattery;
    	      this.reportDevStatusMargin = defaults.reportDevStatusMargin;
    	      this.targetPer = defaults.targetPer;
    	      this.ulBucketSize = defaults.ulBucketSize;
    	      this.ulRate = defaults.ulRate;
    	      this.ulRatePolicy = defaults.ulRatePolicy;
        }

        public Builder setAddGwMetadata(@Nullable Input<Boolean> addGwMetadata) {
            this.addGwMetadata = addGwMetadata;
            return this;
        }

        public Builder setAddGwMetadata(@Nullable Boolean addGwMetadata) {
            this.addGwMetadata = Input.ofNullable(addGwMetadata);
            return this;
        }

        public Builder setChannelMask(@Nullable Input<String> channelMask) {
            this.channelMask = channelMask;
            return this;
        }

        public Builder setChannelMask(@Nullable String channelMask) {
            this.channelMask = Input.ofNullable(channelMask);
            return this;
        }

        public Builder setDevStatusReqFreq(@Nullable Input<Integer> devStatusReqFreq) {
            this.devStatusReqFreq = devStatusReqFreq;
            return this;
        }

        public Builder setDevStatusReqFreq(@Nullable Integer devStatusReqFreq) {
            this.devStatusReqFreq = Input.ofNullable(devStatusReqFreq);
            return this;
        }

        public Builder setDlBucketSize(@Nullable Input<Integer> dlBucketSize) {
            this.dlBucketSize = dlBucketSize;
            return this;
        }

        public Builder setDlBucketSize(@Nullable Integer dlBucketSize) {
            this.dlBucketSize = Input.ofNullable(dlBucketSize);
            return this;
        }

        public Builder setDlRate(@Nullable Input<Integer> dlRate) {
            this.dlRate = dlRate;
            return this;
        }

        public Builder setDlRate(@Nullable Integer dlRate) {
            this.dlRate = Input.ofNullable(dlRate);
            return this;
        }

        public Builder setDlRatePolicy(@Nullable Input<String> dlRatePolicy) {
            this.dlRatePolicy = dlRatePolicy;
            return this;
        }

        public Builder setDlRatePolicy(@Nullable String dlRatePolicy) {
            this.dlRatePolicy = Input.ofNullable(dlRatePolicy);
            return this;
        }

        public Builder setDrMax(@Nullable Input<Integer> drMax) {
            this.drMax = drMax;
            return this;
        }

        public Builder setDrMax(@Nullable Integer drMax) {
            this.drMax = Input.ofNullable(drMax);
            return this;
        }

        public Builder setDrMin(@Nullable Input<Integer> drMin) {
            this.drMin = drMin;
            return this;
        }

        public Builder setDrMin(@Nullable Integer drMin) {
            this.drMin = Input.ofNullable(drMin);
            return this;
        }

        public Builder setHrAllowed(@Nullable Input<Boolean> hrAllowed) {
            this.hrAllowed = hrAllowed;
            return this;
        }

        public Builder setHrAllowed(@Nullable Boolean hrAllowed) {
            this.hrAllowed = Input.ofNullable(hrAllowed);
            return this;
        }

        public Builder setMinGwDiversity(@Nullable Input<Integer> minGwDiversity) {
            this.minGwDiversity = minGwDiversity;
            return this;
        }

        public Builder setMinGwDiversity(@Nullable Integer minGwDiversity) {
            this.minGwDiversity = Input.ofNullable(minGwDiversity);
            return this;
        }

        public Builder setNwkGeoLoc(@Nullable Input<Boolean> nwkGeoLoc) {
            this.nwkGeoLoc = nwkGeoLoc;
            return this;
        }

        public Builder setNwkGeoLoc(@Nullable Boolean nwkGeoLoc) {
            this.nwkGeoLoc = Input.ofNullable(nwkGeoLoc);
            return this;
        }

        public Builder setPrAllowed(@Nullable Input<Boolean> prAllowed) {
            this.prAllowed = prAllowed;
            return this;
        }

        public Builder setPrAllowed(@Nullable Boolean prAllowed) {
            this.prAllowed = Input.ofNullable(prAllowed);
            return this;
        }

        public Builder setRaAllowed(@Nullable Input<Boolean> raAllowed) {
            this.raAllowed = raAllowed;
            return this;
        }

        public Builder setRaAllowed(@Nullable Boolean raAllowed) {
            this.raAllowed = Input.ofNullable(raAllowed);
            return this;
        }

        public Builder setReportDevStatusBattery(@Nullable Input<Boolean> reportDevStatusBattery) {
            this.reportDevStatusBattery = reportDevStatusBattery;
            return this;
        }

        public Builder setReportDevStatusBattery(@Nullable Boolean reportDevStatusBattery) {
            this.reportDevStatusBattery = Input.ofNullable(reportDevStatusBattery);
            return this;
        }

        public Builder setReportDevStatusMargin(@Nullable Input<Boolean> reportDevStatusMargin) {
            this.reportDevStatusMargin = reportDevStatusMargin;
            return this;
        }

        public Builder setReportDevStatusMargin(@Nullable Boolean reportDevStatusMargin) {
            this.reportDevStatusMargin = Input.ofNullable(reportDevStatusMargin);
            return this;
        }

        public Builder setTargetPer(@Nullable Input<Integer> targetPer) {
            this.targetPer = targetPer;
            return this;
        }

        public Builder setTargetPer(@Nullable Integer targetPer) {
            this.targetPer = Input.ofNullable(targetPer);
            return this;
        }

        public Builder setUlBucketSize(@Nullable Input<Integer> ulBucketSize) {
            this.ulBucketSize = ulBucketSize;
            return this;
        }

        public Builder setUlBucketSize(@Nullable Integer ulBucketSize) {
            this.ulBucketSize = Input.ofNullable(ulBucketSize);
            return this;
        }

        public Builder setUlRate(@Nullable Input<Integer> ulRate) {
            this.ulRate = ulRate;
            return this;
        }

        public Builder setUlRate(@Nullable Integer ulRate) {
            this.ulRate = Input.ofNullable(ulRate);
            return this;
        }

        public Builder setUlRatePolicy(@Nullable Input<String> ulRatePolicy) {
            this.ulRatePolicy = ulRatePolicy;
            return this;
        }

        public Builder setUlRatePolicy(@Nullable String ulRatePolicy) {
            this.ulRatePolicy = Input.ofNullable(ulRatePolicy);
            return this;
        }
        public ServiceProfileLoRaWANServiceProfileArgs build() {
            return new ServiceProfileLoRaWANServiceProfileArgs(addGwMetadata, channelMask, devStatusReqFreq, dlBucketSize, dlRate, dlRatePolicy, drMax, drMin, hrAllowed, minGwDiversity, nwkGeoLoc, prAllowed, raAllowed, reportDevStatusBattery, reportDevStatusMargin, targetPer, ulBucketSize, ulRate, ulRatePolicy);
        }
    }
}
